package com.lrh.project12306.framework.starter.idempotent.core.spel;

import com.lrh.project12306.framework.starter.cache.DistributedCache;
import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import com.lrh.project12306.framework.starter.idempotent.core.*;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentMQConsumeStatusEnum;
import com.lrh.project12306.framework.starter.idempotent.toolkit.LogUtil;
import com.lrh.project12306.framework.starter.idempotent.toolkit.SpELUtil;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core.spel
 * @ClassName: IdempotentSpELByMQExecuteHandler
 * @Author: 63283
 * @Description: 基于 SpEL 方法验证请求幂等性，适用于 MQ 场景
 * @Date: 2024/3/7 11:15
 */

@RequiredArgsConstructor
public class IdempotentSpELByMQExecuteHandler extends AbstractIdempotentExecuteHandler implements IdempotentSpELService{
    private final DistributedCache distributedCache;

    private final static int TIMEOUT = 600;
    private final static String WRAPPER = "wrapper:spEL:MQ";

    @SneakyThrows
    @Override
    protected IdempotentParamWrapper buildWrapper(ProceedingJoinPoint joinPoint) {
        Idempotent idempotent = IdempotentAspect.getIdempotent(joinPoint);
        String key = (String) SpELUtil.parseKey(idempotent.key(), ((MethodSignature) joinPoint.getSignature()).getMethod(), joinPoint.getArgs());
        return IdempotentParamWrapper.builder().lockKey(key).joinPoint(joinPoint).build();
    }

    @Override
    public void handler(IdempotentParamWrapper wrapper) {
        String uniqueKey = wrapper.getIdempotent().uniqueKeyPrefix() + wrapper.getLockKey();
        Boolean setIfAbsent = ((StringRedisTemplate) distributedCache.getInstance())
                .opsForValue()
                .setIfAbsent(uniqueKey, IdempotentMQConsumeStatusEnum.CONSUMING.getCode(), TIMEOUT, TimeUnit.SECONDS);
        if (setIfAbsent != null && !setIfAbsent) {
            String consumeStatus = distributedCache.get(uniqueKey, String.class);
            boolean error = IdempotentMQConsumeStatusEnum.isError(consumeStatus);
            LogUtil.getLog(wrapper.getJoinPoint()).warn("[{}] MQ repeated consumption, {}.", uniqueKey, error ? "Wait for the client to delay consumption" : "Status is completed");
            throw new RepeatConsumptionException(error);
        }
        IdempotentContext.put(WRAPPER, wrapper);
    }

    @Override
    public void exceptionProcessing() {
        IdempotentParamWrapper wrapper = (IdempotentParamWrapper) IdempotentContext.getKey(WRAPPER);
        if (wrapper != null) {
            Idempotent idempotent = wrapper.getIdempotent();
            String uniqueKey = idempotent.uniqueKeyPrefix() + wrapper.getLockKey();
            try {
                distributedCache.delete(uniqueKey);
            } catch (Throwable ex) {
                LogUtil.getLog(wrapper.getJoinPoint()).error("[{}] Failed to del MQ anti-heavy token.", uniqueKey);
            }
        }
    }

    @Override
    public void postProcessing() {
        IdempotentParamWrapper wrapper = (IdempotentParamWrapper) IdempotentContext.getKey(WRAPPER);
        if (wrapper != null) {
            Idempotent idempotent = wrapper.getIdempotent();
            String uniqueKey = idempotent.uniqueKeyPrefix() + wrapper.getLockKey();
            try {
                distributedCache.put(uniqueKey, IdempotentMQConsumeStatusEnum.CONSUMED.getCode(), idempotent.keyTimeout(), TimeUnit.SECONDS);
            } catch (Throwable ex) {
                LogUtil.getLog(wrapper.getJoinPoint()).error("[{}] Failed to set MQ anti-heavy token.", uniqueKey);
            }
        }
    }
}

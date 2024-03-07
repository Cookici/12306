package com.lrh.project12306.framework.starter.idempotent.core;

import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core
 * @ClassName: AbstractIdempotentExecuteHandler
 * @Author: 63283
 * @Description: 抽象幂等执行处理器
 * @Date: 2024/3/7 11:06
 */

public abstract class AbstractIdempotentExecuteHandler implements IdempotentExecuteHandler {

    /**
     * 构建幂等验证过程中所需要的参数包装器
     *
     * @param joinPoint AOP 方法处理
     * @return 幂等参数包装器
     */
    protected abstract IdempotentParamWrapper buildWrapper(ProceedingJoinPoint joinPoint);

    /**
     * 执行幂等处理逻辑
     *
     * @param joinPoint  AOP 方法处理
     * @param idempotent 幂等注解
     */
    public void execute(ProceedingJoinPoint joinPoint, Idempotent idempotent) {
        // 模板方法模式：构建幂等参数包装器
        IdempotentParamWrapper idempotentParamWrapper = buildWrapper(joinPoint).setIdempotent(idempotent);
        handler(idempotentParamWrapper);
    }
}

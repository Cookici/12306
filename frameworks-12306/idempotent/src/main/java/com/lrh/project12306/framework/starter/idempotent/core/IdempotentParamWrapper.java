package com.lrh.project12306.framework.starter.idempotent.core;

import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core
 * @ClassName: IdempotentParamWrapper
 * @Author: 63283
 * @Description: 幂等参数包装
 * @Date: 2024/3/7 11:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class IdempotentParamWrapper {
    /**
     * 幂等注解
     */
    private Idempotent idempotent;

    /**
     * AOP 处理连接点
     */
    private ProceedingJoinPoint joinPoint;

    /**
     * 锁标识，{@link IdempotentTypeEnum#PARAM}
     */
    private String lockKey;
}

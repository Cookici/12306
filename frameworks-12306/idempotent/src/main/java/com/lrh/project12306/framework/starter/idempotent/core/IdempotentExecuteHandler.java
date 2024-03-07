package com.lrh.project12306.framework.starter.idempotent.core;

import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core
 * @ClassName: IdempotentExecuteHandler
 * @Author: 63283
 * @Description: 幂等执行处理器
 * @Date: 2024/3/7 11:02
 */

public interface IdempotentExecuteHandler {
    /**
     * 幂等处理逻辑
     *
     * @param wrapper 幂等参数包装器
     */
    void handler(IdempotentParamWrapper wrapper);

    /**
     * 执行幂等处理逻辑
     *
     * @param joinPoint  AOP 方法处理
     * @param idempotent 幂等注解
     */
    void execute(ProceedingJoinPoint joinPoint, Idempotent idempotent);

    /**
     * 异常流程处理
     */
    default void exceptionProcessing() {

    }

    /**
     * 后置处理
     */
    default void postProcessing() {

    }
}

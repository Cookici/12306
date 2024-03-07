package com.lrh.project12306.framework.starter.idempotent.toolkit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.toolkit
 * @ClassName: LogUtil
 * @Author: 63283
 * @Description: 日志工具类
 * @Date: 2024/3/7 11:15
 */

public class LogUtil {
    /**
     * 获取 Logger
     */
    public static Logger getLog(ProceedingJoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        return LoggerFactory.getLogger(methodSignature.getDeclaringType());
    }
}

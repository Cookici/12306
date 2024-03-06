package com.lrh.project12306.framework.starter.common.threadpool.proxy;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.common.threadpool.proxy
 * @ClassName: RejectedProxyInvocationHandler
 * @Author: 63283
 * @Description: 线程池拒绝策略代理执行器
 * @Date: 2024/3/6 16:56
 */
@Slf4j
@AllArgsConstructor
public class RejectedProxyInvocationHandler implements InvocationHandler {
    /**
     * Target object
     */
    private final Object target;

    /**
     * Reject count
     */
    private final AtomicLong rejectCount;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        rejectCount.incrementAndGet();
        try {
            log.error("线程池执行拒绝策略, 此处模拟报警...");
            return method.invoke(target, args);
        } catch (InvocationTargetException ex) {
            throw ex.getCause();
        }
    }
}

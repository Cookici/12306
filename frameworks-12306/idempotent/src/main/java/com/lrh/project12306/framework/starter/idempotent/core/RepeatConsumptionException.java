package com.lrh.project12306.framework.starter.idempotent.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core
 * @ClassName: RepeatConsumptionException
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/7 11:17
 */
@RequiredArgsConstructor
public class RepeatConsumptionException extends RuntimeException {

    /**
     * 错误标识
     * <p>
     * 触发幂等逻辑时可能有两种情况：
     * 1. 消息还在处理，但是不确定是否执行成功，那么需要返回错误，方便 RocketMQ 再次通过重试队列投递
     * 2. 消息处理成功了，该消息直接返回成功即可
     */
    @Getter
    private final Boolean error;
}

package com.lrh.project12306.biz.ticketservice.config;

import cn.hippo4j.common.executor.support.BlockingQueueTypeEnum;
import cn.hippo4j.core.executor.DynamicThreadPool;
import cn.hippo4j.core.executor.support.ThreadPoolBuilder;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.config
 * @ClassName: Hippo4jThreadPoolConfiguration
 * @Author: 63283
 * @Description: Hippo4j 动态线程池配置 异步线程池框架，支持线程池动态变更&监控&报警
 * @Date: 2024/3/7 22:09
 */

public class Hippo4jThreadPoolConfiguration {

    /**
     * 分配一个用户购买不同类型车票的线程池
     */
    @Bean
    @DynamicThreadPool
    public ThreadPoolExecutor selectSeatThreadPoolExecutor() {
        String threadPoolId = "select-seat-thread-pool-executor";
        return ThreadPoolBuilder.builder()
                .threadPoolId(threadPoolId)
                .threadFactory(threadPoolId)
                .workQueue(BlockingQueueTypeEnum.SYNCHRONOUS_QUEUE)
                .corePoolSize(24)
                .maximumPoolSize(36)
                .allowCoreThreadTimeOut(true)
                .keepAliveTime(60, TimeUnit.MINUTES)
                .rejected(new ThreadPoolExecutor.CallerRunsPolicy())
                .dynamicPool()
                .build();
    }

}

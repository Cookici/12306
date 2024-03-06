package com.lrh.project12306.framework.starter.distributedid.config;

import com.lrh.project12306.framework.starter.bases.ApplicationContextHolder;
import com.lrh.project12306.framework.starter.distributedid.core.sonwflake.LocalRedisWorkIdChoose;
import com.lrh.project12306.framework.starter.distributedid.core.sonwflake.RandomWorkIdChoose;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.distributedid.config
 * @ClassName: DistributedIdAutoConfiguration
 * @Author: 63283
 * @Description: 分布式 ID 自动装配
 * @Date: 2024/3/6 21:05
 */
@Import(ApplicationContextHolder.class)
public class DistributedIdAutoConfiguration {
    /**
     * 本地 Redis 构建雪花 WorkId 选择器
     */
    @Bean
    @ConditionalOnProperty("spring.data.redis.host")
    public LocalRedisWorkIdChoose redisWorkIdChoose() {
        return new LocalRedisWorkIdChoose();
    }

    /**
     * 随机数构建雪花 WorkId 选择器。如果项目未使用 Redis，使用该选择器
     */
    @Bean
    @ConditionalOnMissingBean(LocalRedisWorkIdChoose.class)
    public RandomWorkIdChoose randomWorkIdChoose() {
        return new RandomWorkIdChoose();
    }
}

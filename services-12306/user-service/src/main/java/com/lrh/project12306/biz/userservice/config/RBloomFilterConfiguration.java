package com.lrh.project12306.biz.userservice.config;

import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.config
 * @ClassName: RBloomFilterConfiguration
 * @Author: 63283
 * @Description: 布隆过滤器配置
 * @Date: 2024/3/7 17:48
 */
@Configuration
@EnableConfigurationProperties(UserRegisterBloomFilterProperties.class)
public class RBloomFilterConfiguration {
    /**
     * 防止用户注册缓存穿透的布隆过滤器
     */
    @Bean
    public RBloomFilter<String> userRegisterCachePenetrationBloomFilter(RedissonClient redissonClient, UserRegisterBloomFilterProperties userRegisterBloomFilterProperties) {
        RBloomFilter<String> cachePenetrationBloomFilter = redissonClient.getBloomFilter(userRegisterBloomFilterProperties.getName());
        cachePenetrationBloomFilter.tryInit(userRegisterBloomFilterProperties.getExpectedInsertions(), userRegisterBloomFilterProperties.getFalseProbability());
        return cachePenetrationBloomFilter;
    }
}

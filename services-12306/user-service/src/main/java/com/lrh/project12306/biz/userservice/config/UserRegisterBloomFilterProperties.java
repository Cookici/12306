package com.lrh.project12306.biz.userservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.config
 * @ClassName: UserRegisterBloomFilterProperties
 * @Author: 63283
 * @Description: 用户注册布隆过滤器属性配置
 * @Date: 2024/3/7 17:48
 */
@Data
@ConfigurationProperties(prefix = UserRegisterBloomFilterProperties.PREFIX)
public class UserRegisterBloomFilterProperties {
    public static final String PREFIX = "framework.cache.redis.bloom-filter.user-register";

    /**
     * 用户注册布隆过滤器实例名称
     */
    private String name = "user_register_cache_penetration_bloom_filter";

    /**
     * 每个元素的预期插入量
     */
    private Long expectedInsertions = 64L;

    /**
     * 预期错误概率
     */
    private Double falseProbability = 0.03D;
}

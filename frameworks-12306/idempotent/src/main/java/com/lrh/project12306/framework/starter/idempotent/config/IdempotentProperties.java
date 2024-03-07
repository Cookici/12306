package com.lrh.project12306.framework.starter.idempotent.config;

import com.lrh.project12306.framework.starter.cache.config.RedisDistributedProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.config
 * @ClassName: IdempotentProperties
 * @Author: 63283
 * @Description: 幂等属性配置
 * @Date: 2024/3/7 10:57
 */
@Data
@ConfigurationProperties(prefix = IdempotentProperties.PREFIX)
public class IdempotentProperties {

    public static final String PREFIX = "congomall.idempotent.token";

    /**
     * Token 幂等 Key 前缀
     */
    private String prefix;

    /**
     * Token 申请后过期时间
     * 单位默认毫秒 {@link TimeUnit#MILLISECONDS}
     * 随着分布式缓存过期时间单位 {@link RedisDistributedProperties} valueTimeUnit 而变化
     */
    private Long timeout;
}

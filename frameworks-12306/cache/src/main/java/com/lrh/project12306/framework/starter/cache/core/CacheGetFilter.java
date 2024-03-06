package com.lrh.project12306.framework.starter.cache.core;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache.core
 * @ClassName: CacheGetFilter
 * @Author: 63283
 * @Description: 缓存过滤
 * @Date: 2024/3/6 15:53
 */

@FunctionalInterface
public interface CacheGetFilter<T> {
    /**
     * 缓存过滤
     *
     * @param param 输出参数
     * @return {@code true} 如果输入参数匹配，否则 {@link Boolean#TRUE}
     */
    boolean filter(T param);
}

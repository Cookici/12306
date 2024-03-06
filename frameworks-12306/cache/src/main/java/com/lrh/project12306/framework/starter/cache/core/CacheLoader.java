package com.lrh.project12306.framework.starter.cache.core;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache.core
 * @ClassName: CacheLoader
 * @Author: 63283
 * @Description: 缓存加载器
 * @Date: 2024/3/6 15:55
 */
@FunctionalInterface
public interface CacheLoader<T> {
    /**
     * 加载缓存
     */
    T load();
}

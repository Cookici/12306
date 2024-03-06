package com.lrh.project12306.framework.starter.cache.core;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache.core
 * @ClassName: CacheGetIfAbsent
 * @Author: 63283
 * @Description: 缓存查询为空
 * @Date: 2024/3/6 15:54
 */
@FunctionalInterface
public interface CacheGetIfAbsent<T> {
    /**
     * 如果查询结果为空，执行逻辑
     */
    void execute(T param);
}

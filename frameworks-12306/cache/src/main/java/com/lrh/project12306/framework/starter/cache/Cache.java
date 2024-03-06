package com.lrh.project12306.framework.starter.cache;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Collection;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache
 * @ClassName: Cache
 * @Author: 63283
 * @Description: 缓存接口
 * @Date: 2024/3/6 15:57
 */

public interface Cache {
    <T> T get(@NotBlank String key, Class<T> clazz);

    /**
     * 放入缓存
     */
    void put(@NotBlank String key, Object value);

    /**
     * 如果 keys 全部不存在，则新增，返回 true，反之 false
     */
    Boolean putIfAllAbsent(@NotNull Collection<String> keys);

    /**
     * 删除缓存
     */
    Boolean delete(@NotBlank String key);

    /**
     * 删除 keys，返回删除数量
     */
    Long delete(@NotNull Collection<String> keys);

    /**
     * 判断 key 是否存在
     */
    Boolean hasKey(@NotBlank String key);

    /**
     * 获取缓存组件实例
     */
    Object getInstance();
}

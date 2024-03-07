package com.lrh.project12306.framework.starter.idempotent.core;

import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core
 * @ClassName: IdempotentContext
 * @Author: 63283
 * @Description: 幂等上下文
 * @Date: 2024/3/7 11:12
 */

public class IdempotentContext {
    private static final ThreadLocal<Map<String, Object>> CONTEXT = new ThreadLocal<>();

    public static Map<String, Object> get() {
        return CONTEXT.get();
    }

    public static Object getKey(String key) {
        Map<String, Object> context = get();
        if (CollUtil.isNotEmpty(context)) {
            return context.get(key);
        }
        return null;
    }

    public static String getString(String key) {
        Object actual = getKey(key);
        if (actual != null) {
            return actual.toString();
        }
        return null;
    }

    public static void put(String key, Object val) {
        Map<String, Object> context = get();
        if (CollUtil.isEmpty(context)) {
            context = Maps.newHashMap();
        }
        context.put(key, val);
        putContext(context);
    }

    public static void putContext(Map<String, Object> context) {
        Map<String, Object> threadContext = CONTEXT.get();
        if (CollUtil.isNotEmpty(threadContext)) {
            threadContext.putAll(context);
            return;
        }
        CONTEXT.set(context);
    }

    public static void clean() {
        CONTEXT.remove();
    }
}

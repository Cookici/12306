package com.lrh.project12306.framework.starter.cache.toolkit;

import com.alibaba.fastjson2.util.ParameterizedTypeImpl;

import java.lang.reflect.Type;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache.toolkit
 * @ClassName: FastJson2Util
 * @Author: 63283
 * @Description: FastJson2 工具类
 * @Date: 2024/3/6 15:56
 */

public final class FastJson2Util {
    /**
     * 构建类型
     */
    public static Type buildType(Type... types) {
        ParameterizedTypeImpl beforeType = null;
        if (types != null && types.length > 0) {
            if (types.length == 1) {
                return new ParameterizedTypeImpl(new Type[]{null}, null, types[0]);
            }
            for (int i = types.length - 1; i > 0; i--) {
                beforeType = new ParameterizedTypeImpl(new Type[]{beforeType == null ? types[i] : beforeType}, null, types[i - 1]);
            }
        }
        return beforeType;
    }
}

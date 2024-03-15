/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lrh.project12306.framework.starter.cache.toolkit;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.cache.toolkit
 * @ClassName: CacheUtil
 * @Author: 63283
 * @Description: 缓存工具类
 * @Date: 2024/3/6 15:55
 */

public final class CacheUtil {

    private static final String SPLICING_OPERATOR = "_";


    /**
     * 构建缓存标识
     */
    public static String buildKey(String... keys) {
        Stream.of(keys).forEach(each -> Optional.ofNullable(Strings.emptyToNull(each)).orElseThrow(() -> new RuntimeException("构建缓存 key 不允许为空")));
        return Joiner.on(SPLICING_OPERATOR).join(keys);
    }

    /**
     * 判断结果是否为空或空的字符串
     */
    public static boolean isNullOrBlank(Object cacheVal) {
        return cacheVal == null || (cacheVal instanceof String && Strings.isNullOrEmpty((String) cacheVal));
    }

}

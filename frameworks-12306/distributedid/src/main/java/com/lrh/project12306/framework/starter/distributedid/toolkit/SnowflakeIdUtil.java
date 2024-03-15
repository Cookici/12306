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

package com.lrh.project12306.framework.starter.distributedid.toolkit;

import com.lrh.project12306.framework.starter.distributedid.core.sonwflake.Snowflake;
import com.lrh.project12306.framework.starter.distributedid.core.sonwflake.SnowflakeIdInfo;
import com.lrh.project12306.framework.starter.distributedid.handler.IdGeneratorManager;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.distributedid.toolkit
 * @ClassName: SnowflakeIdUtil
 * @Author: 63283
 * @Description: 分布式雪花 ID 生成器
 * @Date: 2024/3/6 20:56
 */

public class SnowflakeIdUtil {
    /**
     * 雪花算法对象
     */
    private static Snowflake SNOWFLAKE;

    /**
     * 初始化雪花算法
     */
    public static void initSnowflake(Snowflake snowflake) {
        SnowflakeIdUtil.SNOWFLAKE = snowflake;
    }

    /**
     * 获取雪花算法实例
     */
    public static Snowflake getInstance() {
        return SNOWFLAKE;
    }

    /**
     * 获取雪花算法下一个 ID
     */
    public static long nextId() {
        return SNOWFLAKE.nextId();
    }

    /**
     * 获取雪花算法下一个字符串类型 ID
     */
    public static String nextIdStr() {
        return Long.toString(nextId());
    }

    /**
     * 解析雪花算法生成的 ID 为对象
     */
    public static SnowflakeIdInfo parseSnowflakeId(String snowflakeId) {
        return SNOWFLAKE.parseSnowflakeId(Long.parseLong(snowflakeId));
    }

    /**
     * 解析雪花算法生成的 ID 为对象
     */
    public static SnowflakeIdInfo parseSnowflakeId(long snowflakeId) {
        return SNOWFLAKE.parseSnowflakeId(snowflakeId);
    }

    /**
     * 根据 {@param serviceId} 生成雪花算法 ID
     */
    public static long nextIdByService(String serviceId) {
        return IdGeneratorManager.getDefaultServiceIdGenerator().nextId(Long.parseLong(serviceId));
    }

    /**
     * 根据 {@param serviceId} 生成字符串类型雪花算法 ID
     */
    public static String nextIdStrByService(String serviceId) {
        return IdGeneratorManager.getDefaultServiceIdGenerator().nextIdStr(Long.parseLong(serviceId));
    }

    /**
     * 根据 {@param serviceId} 生成字符串类型雪花算法 ID
     */
    public static String nextIdStrByService(String resource, long serviceId) {
        return IdGeneratorManager.getIdGenerator(resource).nextIdStr(serviceId);
    }

    /**
     * 根据 {@param serviceId} 生成字符串类型雪花算法 ID
     */
    public static String nextIdStrByService(String resource, String serviceId) {
        return IdGeneratorManager.getIdGenerator(resource).nextIdStr(serviceId);
    }

    /**
     * 解析雪花算法生成的 ID 为对象
     */
    public static SnowflakeIdInfo parseSnowflakeServiceId(String snowflakeId) {
        return IdGeneratorManager.getDefaultServiceIdGenerator().parseSnowflakeId(Long.parseLong(snowflakeId));
    }

    /**
     * 解析雪花算法生成的 ID 为对象
     */
    public static SnowflakeIdInfo parseSnowflakeServiceId(String resource, String snowflakeId) {
        return IdGeneratorManager.getIdGenerator(resource).parseSnowflakeId(Long.parseLong(snowflakeId));
    }
}

package com.lrh.project12306.framework.starter.distributedid.core.serviceid;

import com.lrh.project12306.framework.starter.distributedid.core.IdGenerator;
import com.lrh.project12306.framework.starter.distributedid.core.sonwflake.SnowflakeIdInfo;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.distributedid.core.serviceid
 * @ClassName: ServiceIdGenerator
 * @Author: 63283
 * @Description: 业务 ID 生成器
 * @Date: 2024/3/6 21:04
 */

public interface ServiceIdGenerator extends IdGenerator {
    /**
     * 根据 {@param serviceId} 生成雪花算法 ID
     */
    default long nextId(long serviceId) {
        return 0L;
    }

    /**
     * 根据 {@param serviceId} 生成雪花算法 ID
     */
    default long nextId(String serviceId) {
        return 0L;
    }

    /**
     * 根据 {@param serviceId} 生成字符串类型雪花算法 ID
     */
    default String nextIdStr(long serviceId) {
        return null;
    }

    /**
     * 根据 {@param serviceId} 生成字符串类型雪花算法 ID
     */
    default String nextIdStr(String serviceId) {
        return null;
    }

    /**
     * 解析雪花算法
     */
    SnowflakeIdInfo parseSnowflakeId(long snowflakeId);
}

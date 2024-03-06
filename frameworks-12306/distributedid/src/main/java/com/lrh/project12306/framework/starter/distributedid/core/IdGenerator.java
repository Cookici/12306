package com.lrh.project12306.framework.starter.distributedid.core;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.distributedid.core
 * @ClassName: IdGenerator
 * @Author: 63283
 * @Description: ID 生成器
 * @Date: 2024/3/6 21:00
 */

public interface IdGenerator {

    /**
     * 下一个 ID
     */
    default long nextId() {
        return 0L;
    }

    /**
     * 下一个 ID 字符串
     */
    default String nextIdStr() {
        return "";
    }
}

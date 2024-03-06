package com.lrh.project12306.framework.starter.common.toolkit;

import lombok.SneakyThrows;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.common.toolkit
 * @ClassName: ThreadUtil
 * @Author: 63283
 * @Description: 线程池工具类
 * @Date: 2024/3/6 16:57
 */

public class ThreadUtil {
    /**
     * 睡眠当前线程指定时间 {@param millis}
     *
     * @param millis 睡眠时间，单位毫秒
     */
    @SneakyThrows(value = InterruptedException.class)
    public static void sleep(long millis) {
        Thread.sleep(millis);
    }
}
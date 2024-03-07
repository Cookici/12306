package com.lrh.project12306.framework.starter.log.config;

import com.lrh.project12306.framework.starter.log.annotation.ILog;
import com.lrh.project12306.framework.starter.log.core.ILogPrintAspect;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.log.config
 * @ClassName: LogAutoConfiguration
 * @Author: 63283
 * @Description: 日志自动装配
 * @Date: 2024/3/6 21:46
 */

public class LogAutoConfiguration {
    /**
     * {@link ILog} 日志打印 AOP 切面
     */
    @Bean
    public ILogPrintAspect iLogPrintAspect() {
        return new ILogPrintAspect();
    }
}

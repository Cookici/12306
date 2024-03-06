package com.lrh.project12306.framework.starter.designpattern.config;

import com.lrh.project12306.framework.starter.bases.config.ApplicationBaseAutoConfiguration;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainContext;
import com.lrh.project12306.framework.starter.designpattern.strategy.AbstractStrategyChoose;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.designpattern.config
 * @ClassName: DesignPatternAutoConfiguration
 * @Author: 63283
 * @Description: 设计模式自动装配
 * @Date: 2024/3/6 18:01
 */
@ImportAutoConfiguration(ApplicationBaseAutoConfiguration.class)
public class DesignPatternAutoConfiguration {
    /**
     * 策略模式选择器
     */
    @Bean
    public AbstractStrategyChoose abstractStrategyChoose() {
        return new AbstractStrategyChoose();
    }

    /**
     * 责任链上下文
     */
    @Bean
    public AbstractChainContext abstractChainContext() {
        return new AbstractChainContext();
    }
}

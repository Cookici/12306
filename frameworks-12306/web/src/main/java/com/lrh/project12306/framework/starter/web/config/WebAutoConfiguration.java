package com.lrh.project12306.framework.starter.web.config;

import com.lrh.project12306.framework.starter.web.GlobalExceptionHandler;
import com.lrh.project12306.framework.starter.web.initialize.InitializeDispatcherServletController;
import com.lrh.project12306.framework.starter.web.initialize.InitializeDispatcherServletHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.web.config
 * @ClassName: WebAutoConfiguration
 * @Author: 63283
 * @Description: Web 组件自动装配
 * @Date: 2024/3/6 22:38
 */

public class WebAutoConfiguration {
    public final static String INITIALIZE_PATH = "/initialize/dispatcher-servlet";

    @Bean
    @ConditionalOnMissingBean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Bean
    public InitializeDispatcherServletController initializeDispatcherServletController() {
        return new InitializeDispatcherServletController();
    }

    @Bean
    public RestTemplate simpleRestTemplate(ClientHttpRequestFactory factory) {
        return new RestTemplate(factory);
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(5000);
        return factory;
    }

    @Bean
    public InitializeDispatcherServletHandler initializeDispatcherServletHandler(RestTemplate simpleRestTemplate, ConfigurableEnvironment configurableEnvironment) {
        return new InitializeDispatcherServletHandler(simpleRestTemplate, configurableEnvironment);
    }
}

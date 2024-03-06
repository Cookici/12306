package com.lrh.project12306.framework.starter.user.config;

import com.lrh.project12306.framework.starter.user.core.UserTransmitFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import static com.lrh.project12306.framework.starter.bases.constant.FilterOrderConstant.USER_TRANSMIT_FILTER_ORDER;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.frameworks.starter.user.config
 * @ClassName: UserAutoConfiguration
 * @Author: 63283
 * @Description: 用户配置自动装配
 * @Date: 2024/3/6 0:23
 */
@ConditionalOnWebApplication
public class UserAutoConfiguration {
    /**
     * 用户信息传递过滤器
     */
    @Bean
    public FilterRegistrationBean<UserTransmitFilter> globalUserTransmitFilter() {
        FilterRegistrationBean<UserTransmitFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new UserTransmitFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(USER_TRANSMIT_FILTER_ORDER);
        return registration;
    }
}

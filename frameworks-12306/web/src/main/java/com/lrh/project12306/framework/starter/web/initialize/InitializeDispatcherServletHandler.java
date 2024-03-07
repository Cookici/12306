package com.lrh.project12306.framework.starter.web.initialize;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.DispatcherServlet;

import static com.lrh.project12306.framework.starter.web.config.WebAutoConfiguration.INITIALIZE_PATH;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.web.config.initialize
 * @ClassName: InitializeDispatcherServletHandler
 * @Author: 63283
 * @Description: 通过 {@link InitializeDispatcherServletController} 初始化 {@link DispatcherServlet}
 * @Date: 2024/3/6 22:38
 */

@RequiredArgsConstructor
public final class InitializeDispatcherServletHandler implements CommandLineRunner {

    private final RestTemplate restTemplate;

    private final ConfigurableEnvironment configurableEnvironment;

    @Override
    public void run(String... args) throws Exception {
        String url = String.format("http://127.0.0.1:%s%s",
                configurableEnvironment.getProperty("server.port", "8080") + configurableEnvironment.getProperty("server.servlet.context-path", ""),
                INITIALIZE_PATH);
        try {
            restTemplate.execute(url, HttpMethod.GET, null, null);
        } catch (Throwable ignored) {
        }
    }
}
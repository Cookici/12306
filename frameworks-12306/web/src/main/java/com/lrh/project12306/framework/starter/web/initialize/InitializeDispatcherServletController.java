package com.lrh.project12306.framework.starter.web.initialize;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.lrh.project12306.framework.starter.web.config.WebAutoConfiguration.INITIALIZE_PATH;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.web.initialize
 * @ClassName: InitializeDispatcherServletController
 * @Author: 63283
 * @Description: 初始化 {@link org.springframework.web.servlet.DispatcherServlet}
 * @Date: 2024/3/6 22:39
 */

@Slf4j(topic = "Initialize DispatcherServlet")
@RestController
public class InitializeDispatcherServletController {
    @GetMapping(INITIALIZE_PATH)
    public void initializeDispatcherServlet() {
        log.info("Initialized the dispatcherServlet to improve the first response time of the interface...");
    }
}

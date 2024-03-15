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

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

package com.lrh.project12306.biz.aggregationservice;

import cn.crane4j.spring.boot.annotation.EnableCrane4j;
import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.aggregationservice
 * @ClassName: AggregationServiceApplication
 * @Author: 63283
 * @Description: 12306 聚合服务应用启动器
 * @Date: 2024/3/7 17:23
 */


@EnableDynamicThreadPool
@SpringBootApplication(scanBasePackages = {
        "com.lrh.project12306.biz.userservice",
        "com.lrh.project12306.biz.ticketservice",
        "com.lrh.project12306.biz.orderservice",
        "com.lrh.project12306.biz.payservice"
})
@EnableRetry
@MapperScan(value = {
        "com.lrh.project12306.biz.userservice.dao.mapper",
        "com.lrh.project12306.biz.ticketservice.dao.mapper",
        "com.lrh.project12306.biz.orderservice.dao.mapper",
        "com.lrh.project12306.biz.payservice.dao.mapper"
})
@EnableFeignClients(value = {
        "com.lrh.project12306.biz.ticketservice.remote",
        "com.lrh.project12306.biz.orderservice.remote"
})
@EnableCrane4j(enumPackages = "com.lrh.project12306.biz.orderservice.common.enums")
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}

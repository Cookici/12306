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

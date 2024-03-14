package com.lrh.project12306.biz.orderservice;

import cn.crane4j.spring.boot.annotation.EnableCrane4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice
 * @ClassName: OrderServiceApplication
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/11 12:10
 */
@SpringBootApplication
@MapperScan("com.lrh.project12306.biz.orderservice.dao.mapper")
@EnableFeignClients("com.lrh.project12306.biz.orderservice.remote")
@EnableCrane4j(enumPackages = "com.lrh.project12306.biz.orderservice.common.enums")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}

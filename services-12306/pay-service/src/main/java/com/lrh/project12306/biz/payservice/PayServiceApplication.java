package com.lrh.project12306.biz.payservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice
 * @ClassName: PayServiceApplication
 * @Author: 63283
 * @Description: 支付服务应用启动器
 * @Date: 2024/3/11 14:21
 */
@SpringBootApplication
@MapperScan("com.lrh.project12306.biz.payservice.dao.mapper")
@EnableFeignClients("com.lrh.project12306.biz.payservice.remote")
@EnableRetry
public class PayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayServiceApplication.class, args);
    }
}

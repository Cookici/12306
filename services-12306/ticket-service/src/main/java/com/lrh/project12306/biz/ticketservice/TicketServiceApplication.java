package com.lrh.project12306.biz.ticketservice;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice
 * @ClassName: TicketServiceApplication
 * @Author: 63283
 * @Description: 购票服务应用启动器
 * @Date: 2024/3/7 23:51
 */

@SpringBootApplication
@EnableDynamicThreadPool
@MapperScan("com.lrh.project12306.biz.ticketservice.dao.mapper")
@EnableFeignClients("com.lrh.project12306.biz.ticketservice.remote")
public class TicketServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketServiceApplication.class, args);
    }
}

package com.lrh.project12306.biz.userservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice
 * @ClassName: UserServiceApplication
 * @Author: 63283
 * @Description: 用户服务应用启动器
 * @Date: 2024/3/7 17:35
 */
@SpringBootApplication
@MapperScan("com.lrh.project12306.biz.userservice.dao.mapper")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}

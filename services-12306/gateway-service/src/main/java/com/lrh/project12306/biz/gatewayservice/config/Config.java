package com.lrh.project12306.biz.gatewayservice.config;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.gatewayservice.config
 * @ClassName: Config
 * @Author: 63283
 * @Description: 过滤器配置
 * @Date: 2024/3/7 17:26
 */
@Data
public class Config {
    /**
     * 黑名单前置路径
     */
    private List<String> blackPathPre;
}

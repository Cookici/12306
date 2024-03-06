package com.lrh.project12306.framework.starter.database.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.lrh.project12306.framework.starter.database.handler.CustomIdGenerator;
import com.lrh.project12306.framework.starter.database.handler.MyMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.database.config
 * @ClassName: MybatisPlusAutoConfiguration
 * @Author: 63283
 * @Description: MybatisPlus 配置文件
 * @Date: 2024/3/6 20:40
 */

public class MybatisPlusAutoConfiguration {
    /**
     * 分页插件
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }

    /**
     * 元数据填充
     */
    @Bean
    public MyMetaObjectHandler myMetaObjectHandler() {
        return new MyMetaObjectHandler();
    }

    /**
     * 自定义雪花算法 ID 生成器
     */
    @Bean
    @Primary
    public IdentifierGenerator idGenerator() {
        return new CustomIdGenerator();
    }
}

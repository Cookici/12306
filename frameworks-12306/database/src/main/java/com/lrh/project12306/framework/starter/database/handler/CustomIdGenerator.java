package com.lrh.project12306.framework.starter.database.handler;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.lrh.project12306.framework.starter.distributedid.toolkit.SnowflakeIdUtil;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.database.handler
 * @ClassName: CustomIdGenerator
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/6 20:39
 */

public class CustomIdGenerator implements IdentifierGenerator {
    @Override
    public Number nextId(Object entity) {
        return SnowflakeIdUtil.nextId();
    }
}

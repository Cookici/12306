package com.lrh.project12306.framework.starter.idempotent.enums;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core.enums
 * @ClassName: IdempotentTypeEnum
 * @Author: 63283
 * @Description: 幂等验证类型枚举
 * @Date: 2024/3/7 10:54
 */

public enum IdempotentTypeEnum {

    /**
     * 基于 Token 方式验证
     */
    TOKEN,

    /**
     * 基于方法参数方式验证
     */
    PARAM,

    /**
     * 基于 SpEL 表达式方式验证
     */
    SPEL
}

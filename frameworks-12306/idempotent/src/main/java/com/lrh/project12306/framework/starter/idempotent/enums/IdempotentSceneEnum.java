package com.lrh.project12306.framework.starter.idempotent.enums;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.enums
 * @ClassName: IdempotentSceneEnum
 * @Author: 63283
 * @Description: 幂等验证场景枚举
 * @Date: 2024/3/7 10:55
 */

public enum IdempotentSceneEnum {

    /**
     * 基于 RestAPI 场景验证
     */
    RESTAPI,

    /**
     * 基于 MQ 场景验证
     */
    MQ
}

package com.lrh.project12306.biz.userservice.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.common.enums
 * @ClassName: VerifyStatusEnum
 * @Author: 63283
 * @Description: 用户注册错误码枚举
 * @Date: 2024/3/7 17:47
 */
@AllArgsConstructor
public enum VerifyStatusEnum {
    /**
     * 未审核
     */
    UNREVIEWED(0),

    /**
     * 已审核
     */
    REVIEWED(1);

    @Getter
    private final int code;
}

package com.lrh.project12306.biz.payservice.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.common.enums
 * @ClassName: RefundTypeEnum
 * @Author: 63283
 * @Description: 退款类型枚举
 * @Date: 2024/3/11 12:22
 */
@Getter
@RequiredArgsConstructor
public enum RefundTypeEnum {
    /**
     * 部分退款
     */
    PARTIAL_REFUND(11, 0, "PARTIAL_REFUND", "部分退款"),

    /**
     * 全部退款
     */
    FULL_REFUND(12, 1, "FULL_REFUND", "全部退款");

    private final Integer code;

    private final Integer type;

    private final String name;

    private final String value;
}

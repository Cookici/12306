package com.lrh.project12306.biz.orderservice.common.enums;

import cn.crane4j.annotation.ContainerEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.common.enums
 * @ClassName: OrderItemStatusEnum
 * @Author: 63283
 * @Description: 订单明细状态枚举
 * @Date: 2024/3/11 10:11
 */
@ContainerEnum(namespace = "OrderItemStatusEnum", key = "status", value = "statusName")
@RequiredArgsConstructor
public enum OrderItemStatusEnum {
    /**
     * 待支付
     */
    PENDING_PAYMENT(0, "待支付"),

    /**
     * 已支付
     */
    ALREADY_PAID(10, "已支付"),

    /**
     * 已进站
     */
    ALREADY_PULL_IN(20, "已进站"),

    /**
     * 已取消
     */
    CLOSED(30, "已取消"),

    /**
     * 已退票
     */
    REFUNDED(40, "已退票"),

    /**
     * 已改签
     */
    RESCHEDULED(50, "已改签");

    @Getter
    private final Integer status;

    @Getter
    private final String statusName;
}

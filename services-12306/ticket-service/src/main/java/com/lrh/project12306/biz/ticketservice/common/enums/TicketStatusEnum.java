package com.lrh.project12306.biz.ticketservice.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.common.enums
 * @ClassName: TicketStatusEnum
 * @Author: 63283
 * @Description: 车票状态枚举
 * @Date: 2024/3/7 21:59
 */

@RequiredArgsConstructor
public enum TicketStatusEnum {

    /**
     * 未支付
     */
    UNPAID(0),

    /**
     * 已支付
     */
    PAID(1),

    /**
     * 已进站
     */
    BOARDED(2),

    /**
     * 改签
     */
    CHANGED(3),

    /**
     * 退票
     */
    REFUNDED(4),

    /**
     * 已取消
     */
    CLOSED(5);

    @Getter
    private final Integer code;
}

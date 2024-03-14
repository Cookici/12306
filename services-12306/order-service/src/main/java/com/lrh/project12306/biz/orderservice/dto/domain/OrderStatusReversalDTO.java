package com.lrh.project12306.biz.orderservice.dto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.domain
 * @ClassName: OrderStatusReversalDTO
 * @Author: 63283
 * @Description: 订单状态反转实体
 * @Date: 2024/3/11 11:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatusReversalDTO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 订单反转后状态
     */
    private Integer orderStatus;

    /**
     * 订单明细反转后状态
     */
    private Integer orderItemStatus;
}

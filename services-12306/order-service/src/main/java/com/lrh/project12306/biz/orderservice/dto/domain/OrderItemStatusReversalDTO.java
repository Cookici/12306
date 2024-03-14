package com.lrh.project12306.biz.orderservice.dto.domain;

import com.lrh.project12306.biz.orderservice.dao.entity.OrderItemDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.domain
 * @ClassName: OrderItemStatusReversalDTO
 * @Author: 63283
 * @Description: 子订单状态反转实体
 * @Date: 2024/3/11 11:28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemStatusReversalDTO {
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

    /**
     * 订单明细集合
     */
    private List<OrderItemDO> orderItemDOList;
}

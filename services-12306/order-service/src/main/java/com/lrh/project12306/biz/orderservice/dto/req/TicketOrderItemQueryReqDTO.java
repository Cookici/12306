package com.lrh.project12306.biz.orderservice.dto.req;

import lombok.Data;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.req
 * @ClassName: TicketOrderItemQueryReqDTO
 * @Author: 63283
 * @Description: 车票子订单查询
 * @Date: 2024/3/11 11:35
 */
@Data
public class TicketOrderItemQueryReqDTO {
    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 子订单记录id
     */
    private List<Long> orderItemRecordIds;
}

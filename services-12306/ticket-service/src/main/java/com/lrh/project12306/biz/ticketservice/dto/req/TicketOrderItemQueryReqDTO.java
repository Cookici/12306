package com.lrh.project12306.biz.ticketservice.dto.req;

import java.util.List;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: TicketOrderItemQueryReqDTO
 * @Author: 63283
 * @Description: 车票子订单查询
 * @Date: 2024/3/7 22:29
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
    private List<String> orderItemRecordIds;
}

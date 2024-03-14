package com.lrh.project12306.biz.orderservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.req
 * @ClassName: CancelTicketOrderReqDTO
 * @Author: 63283
 * @Description: 取消车票订单请求入参
 * @Date: 2024/3/11 11:34
 */
@Data
public class CancelTicketOrderReqDTO {
    /**
     * 订单号
     */
    private String orderSn;
}

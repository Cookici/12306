package com.lrh.project12306.biz.ticketservice.remote.dto;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.remote.dto
 * @ClassName: PayInfoRespDTO
 * @Author: 63283
 * @Description: 支付单详情信息返回参数
 * @Date: 2024/3/7 22:46
 */
@Data
public class PayInfoRespDTO {
    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 支付总金额
     */
    private Integer totalAmount;

    /**
     * 支付状态
     */
    private Integer status;

    /**
     * 支付时间
     */
    private Date gmtPayment;
}

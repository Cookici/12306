package com.lrh.project12306.biz.payservice.dto;

import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: PayCreateReqDTO
 * @Author: 63283
 * @Description: 支付单创建请求参数
 * @Date: 2024/3/11 13:50
 */
@Data
public class PayCreateReqDTO {
    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 商户订单号
     */
    private String outOrderSn;

    /**
     * 支付渠道
     */
    private String channel;

    /**
     * 支付环境
     */
    private String tradeType;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 交易凭证号
     */
    private String tradeNo;

    /**
     * 交易总金额
     */
    private Integer totalAmount;

    /**
     * 付款时间
     */
    private Date gmtPayment;

    /**
     * 支付金额
     */
    private Integer payAmount;

    /**
     * 支付状态
     */
    private String status;

    /**
     * 商户订单号
     */
    private String orderRequestId;
}

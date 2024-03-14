package com.lrh.project12306.biz.payservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: PayCallbackReqDTO
 * @Author: 63283
 * @Description: 支付单回调请求参数
 * @Date: 2024/3/11 13:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PayCallbackReqDTO {
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
    private Integer status;

    /**
     * 商户订单号
     */
    private String orderRequestId;
}

package com.lrh.project12306.biz.payservice.service;

import com.lrh.project12306.biz.payservice.dto.*;
import com.lrh.project12306.biz.payservice.dto.base.PayRequest;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.service
 * @ClassName: PayService
 * @Author: 63283
 * @Description: 支付接口层
 * @Date: 2024/3/11 13:56
 */

public interface PayService {
    /**
     * 创建支付单
     *
     * @param requestParam 创建支付单实体
     * @return 支付返回详情
     */
    PayRespDTO commonPay(PayRequest requestParam);

    /**
     * 支付单回调
     *
     * @param requestParam 回调支付单实体
     */
    void callbackPay(PayCallbackReqDTO requestParam);

    /**
     * 跟据订单号查询支付单详情
     *
     * @param orderSn 订单号
     * @return 支付单详情
     */
    PayInfoRespDTO getPayInfoByOrderSn(String orderSn);

    /**
     * 跟据支付流水号查询支付单详情
     *
     * @param paySn 支付单流水号
     * @return 支付单详情
     */
    PayInfoRespDTO getPayInfoByPaySn(String paySn);

    /**
     * 公共退款接口
     *
     * @param requestParam 退款请求参数
     * @return 退款返回详情
     */
    RefundRespDTO commonRefund(RefundReqDTO requestParam);
}

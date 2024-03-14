package com.lrh.project12306.biz.payservice.dto.base;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: RefundRequest
 * @Author: 63283
 * @Description: 退款入参接口
 * @Date: 2024/3/11 13:47
 */

public interface RefundRequest {

    /**
     * 获取阿里退款入参
     */
    AliRefundRequest getAliRefundRequest();

    /**
     * 获取订单号
     */
    String getOrderSn();

    /**
     * 构建查找支付策略实现类标识
     */
    String buildMark();
}

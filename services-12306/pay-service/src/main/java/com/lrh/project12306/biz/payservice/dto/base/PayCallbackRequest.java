package com.lrh.project12306.biz.payservice.dto.base;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: PayCallbackRequest
 * @Author: 63283
 * @Description: 支付回调请求入参
 * @Date: 2024/3/11 13:47
 */

public interface PayCallbackRequest {
    /**
     * 获取阿里支付回调入参
     */
    AliPayCallbackRequest getAliPayCallBackRequest();

    /**
     * 构建查找支付回调策略实现类标识
     */
    String buildMark();
}

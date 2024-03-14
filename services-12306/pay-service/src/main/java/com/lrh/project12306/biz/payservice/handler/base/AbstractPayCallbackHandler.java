package com.lrh.project12306.biz.payservice.handler.base;

import com.lrh.project12306.biz.payservice.dto.base.PayCallbackRequest;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.handler.base
 * @ClassName: AbstractPayCallbackHandler
 * @Author: 63283
 * @Description: 抽象支付回调组件
 * @Date: 2024/3/11 14:02
 */

public abstract class AbstractPayCallbackHandler {
    /**
     * 支付回调抽象接口
     *
     * @param payCallbackRequest 支付回调请求参数
     */
    public abstract void callback(PayCallbackRequest payCallbackRequest);
}

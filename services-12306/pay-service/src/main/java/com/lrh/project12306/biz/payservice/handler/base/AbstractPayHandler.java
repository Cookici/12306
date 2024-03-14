package com.lrh.project12306.biz.payservice.handler.base;

import com.lrh.project12306.biz.payservice.dto.base.PayRequest;
import com.lrh.project12306.biz.payservice.dto.base.PayResponse;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.handler.base
 * @ClassName: AbstractPayHandler
 * @Author: 63283
 * @Description: 抽象支付组件
 * @Date: 2024/3/11 14:05
 */

public abstract class AbstractPayHandler {
    /**
     * 支付抽象接口
     *
     * @param payRequest 支付请求参数
     * @return 支付响应参数
     */
    public abstract PayResponse pay(PayRequest payRequest);
}

package com.lrh.project12306.biz.payservice.handler.base;

import com.lrh.project12306.biz.payservice.dto.base.RefundRequest;
import com.lrh.project12306.biz.payservice.dto.base.RefundResponse;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.handler.base
 * @ClassName: AbstractRefundHandler
 * @Author: 63283
 * @Description: 抽象退款组件
 * @Date: 2024/3/11 14:06
 */

public abstract class AbstractRefundHandler {

    /**
     * 支付退款接口
     *
     * @param payRequest 退款请求参数
     * @return 退款响应参数
     */
    public abstract RefundResponse refund(RefundRequest payRequest);
}

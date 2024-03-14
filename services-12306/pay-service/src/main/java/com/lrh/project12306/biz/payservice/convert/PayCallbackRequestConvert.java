package com.lrh.project12306.biz.payservice.convert;

import com.lrh.project12306.biz.payservice.common.enums.PayChannelEnum;
import com.lrh.project12306.biz.payservice.dto.PayCallbackCommand;
import com.lrh.project12306.biz.payservice.dto.base.AliPayCallbackRequest;
import com.lrh.project12306.biz.payservice.dto.base.PayCallbackRequest;
import com.lrh.project12306.framework.starter.common.toolkit.BeanUtil;

import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.conver
 * @ClassName: PayCallbackRequestConvert
 * @Author: 63283
 * @Description: 支付回调请求入参转换器
 * @Date: 2024/3/11 12:25
 */

public final class PayCallbackRequestConvert {
    /**
     * {@link PayCallbackCommand} to {@link PayCallbackRequest}
     *
     * @param payCallbackCommand 支付回调请求参数
     * @return {@link PayCallbackRequest}
     */
    public static PayCallbackRequest command2PayCallbackRequest(PayCallbackCommand payCallbackCommand) {
        PayCallbackRequest payCallbackRequest = null;
        if (Objects.equals(payCallbackCommand.getChannel(), PayChannelEnum.ALI_PAY.getCode())) {
            payCallbackRequest = BeanUtil.convert(payCallbackCommand, AliPayCallbackRequest.class);
            ((AliPayCallbackRequest) payCallbackRequest).setOrderRequestId(payCallbackCommand.getOrderRequestId());
        }
        return payCallbackRequest;
    }
}

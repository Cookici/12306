package com.lrh.project12306.biz.payservice.convert;

import com.lrh.project12306.biz.payservice.common.enums.PayChannelEnum;
import com.lrh.project12306.biz.payservice.dto.PayCommand;
import com.lrh.project12306.biz.payservice.dto.base.AliPayRequest;
import com.lrh.project12306.biz.payservice.dto.base.PayRequest;
import com.lrh.project12306.framework.starter.common.toolkit.BeanUtil;

import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.convert
 * @ClassName: PayRequestConvert
 * @Author: 63283
 * @Description: 支付请求入参转换器
 * @Date: 2024/3/11 12:26
 */

public class PayRequestConvert {
    /**
     * {@link PayCommand} to {@link PayRequest}
     *
     * @param payCommand 支付请求参数
     * @return {@link PayRequest}
     */
    public static PayRequest command2PayRequest(PayCommand payCommand) {
        PayRequest payRequest = null;
        if (Objects.equals(payCommand.getChannel(), PayChannelEnum.ALI_PAY.getCode())) {
            payRequest = BeanUtil.convert(payCommand, AliPayRequest.class);
        }
        return payRequest;
    }
}

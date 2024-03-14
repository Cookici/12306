package com.lrh.project12306.biz.payservice.handler;

import com.lrh.project12306.biz.payservice.common.enums.PayChannelEnum;
import com.lrh.project12306.biz.payservice.common.enums.TradeStatusEnum;
import com.lrh.project12306.biz.payservice.dto.PayCallbackReqDTO;
import com.lrh.project12306.biz.payservice.dto.base.AliPayCallbackRequest;
import com.lrh.project12306.biz.payservice.dto.base.PayCallbackRequest;
import com.lrh.project12306.biz.payservice.handler.base.AbstractPayCallbackHandler;
import com.lrh.project12306.biz.payservice.service.PayService;
import com.lrh.project12306.framework.starter.designpattern.strategy.AbstractExecuteStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.handler
 * @ClassName: AliPayCallbackHandler
 * @Author: 63283
 * @Description: 阿里支付回调组件
 * @Date: 2024/3/11 14:02
 */
@Slf4j
@Service
@RequiredArgsConstructor
public final class AliPayCallbackHandler extends AbstractPayCallbackHandler implements AbstractExecuteStrategy<PayCallbackRequest, Void> {
    private final PayService payService;

    @Override
    public void callback(PayCallbackRequest payCallbackRequest) {
        AliPayCallbackRequest aliPayCallBackRequest = payCallbackRequest.getAliPayCallBackRequest();
        PayCallbackReqDTO payCallbackRequestParam = PayCallbackReqDTO.builder()
                .status(TradeStatusEnum.queryActualTradeStatusCode(aliPayCallBackRequest.getTradeStatus()))
                .payAmount(aliPayCallBackRequest.getBuyerPayAmount())
                .tradeNo(aliPayCallBackRequest.getTradeNo())
                .gmtPayment(aliPayCallBackRequest.getGmtPayment())
                .orderSn(aliPayCallBackRequest.getOrderRequestId())
                .build();
        payService.callbackPay(payCallbackRequestParam);
    }

    @Override
    public String mark() {
        return PayChannelEnum.ALI_PAY.name();
    }

    public void execute(PayCallbackRequest requestParam) {
        callback(requestParam);
    }
}

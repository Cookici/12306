package com.lrh.project12306.biz.payservice.controller;

import lombok.RequiredArgsConstructor;
import com.lrh.project12306.biz.payservice.convert.PayRequestConvert;
import com.lrh.project12306.biz.payservice.dto.PayCommand;
import com.lrh.project12306.biz.payservice.dto.PayInfoRespDTO;
import com.lrh.project12306.biz.payservice.dto.PayRespDTO;
import com.lrh.project12306.biz.payservice.dto.RefundReqDTO;
import com.lrh.project12306.biz.payservice.dto.RefundRespDTO;
import com.lrh.project12306.biz.payservice.dto.base.PayRequest;
import com.lrh.project12306.biz.payservice.service.PayService;
import com.lrh.project12306.framework.starter.convention.result.Result;
import com.lrh.project12306.framework.starter.web.Results;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.controller
 * @ClassName: PayController
 * @Author: 63283
 * @Description: 支付控制层
 * @Date: 2024/3/11 12:24
 */
@RestController
@RequiredArgsConstructor
public class PayController {
    private final PayService payService;

    /**
     * 公共支付接口
     * 对接常用支付方式，比如：支付宝、微信以及银行卡等
     */
    @PostMapping("/api/pay-service/pay/create")
    public Result<PayRespDTO> pay(@RequestBody PayCommand requestParam) {
        PayRequest payRequest = PayRequestConvert.command2PayRequest(requestParam);
        PayRespDTO result = payService.commonPay(payRequest);
        return Results.success(result);
    }

    /**
     * 跟据订单号查询支付单详情
     */
    @GetMapping("/api/pay-service/pay/query/order-sn")
    public Result<PayInfoRespDTO> getPayInfoByOrderSn(@RequestParam(value = "orderSn") String orderSn) {
        return Results.success(payService.getPayInfoByOrderSn(orderSn));
    }

    /**
     * 跟据支付流水号查询支付单详情
     */
    @GetMapping("/api/pay-service/pay/query/pay-sn")
    public Result<PayInfoRespDTO> getPayInfoByPaySn(@RequestParam(value = "paySn") String paySn) {
        return Results.success(payService.getPayInfoByPaySn(paySn));
    }

    /**
     * 公共退款接口
     * 后续为了方便开发系列退款相关接口，已迁移 RefundController#commonRefund(RefundReqDTO)
     */
    @Deprecated
    @PostMapping("/api/pay-service/refund")
    public Result<RefundRespDTO> refund(@RequestBody RefundReqDTO requestParam) {
        return Results.success(payService.commonRefund(requestParam));
    }
}

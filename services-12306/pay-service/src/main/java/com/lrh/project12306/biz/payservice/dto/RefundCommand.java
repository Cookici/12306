package com.lrh.project12306.biz.payservice.dto;

import com.lrh.project12306.biz.payservice.dto.base.AbstractRefundRequest;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: RefundCommand
 * @Author: 63283
 * @Description: 退款请求命令
 * @Date: 2024/3/11 13:50
 */
@Data
public final class RefundCommand extends AbstractRefundRequest {
    /**
     * 支付金额
     */
    private BigDecimal payAmount;

    /**
     * 交易凭证号
     */
    private String tradeNo;
}

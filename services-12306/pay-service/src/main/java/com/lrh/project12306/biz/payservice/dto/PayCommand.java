package com.lrh.project12306.biz.payservice.dto;

import com.lrh.project12306.biz.payservice.dto.base.AbstractPayRequest;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: PayCommand
 * @Author: 63283
 * @Description: 支付请求命令
 * @Date: 2024/3/11 13:49
 */
@Data
public final class PayCommand extends AbstractPayRequest {

    /**
     * 子订单号
     */
    private String outOrderSn;

    /**
     * 订单总金额
     * 单位为元，精确到小数点后两位，取值范围：[0.01,100000000]
     */
    private BigDecimal totalAmount;

    /**
     * 订单标题
     * 注意：不可使用特殊字符，如 /，=，& 等
     */
    private String subject;
}

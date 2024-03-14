package com.lrh.project12306.biz.payservice.dto.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: AbstractRefundRequest
 * @Author: 63283
 * @Description: 抽象退款入参实体
 * @Date: 2024/3/11 13:44
 */

public abstract class AbstractRefundRequest implements RefundRequest{
    /**
     * 交易环境，H5、小程序、网站等
     */
    @Getter
    @Setter
    private Integer tradeType;

    /**
     * 订单号
     */
    @Getter
    @Setter
    private String orderSn;

    /**
     * 支付渠道
     */
    @Getter
    @Setter
    private Integer channel;

    @Override
    public AliRefundRequest getAliRefundRequest() {
        return null;
    }

    @Override
    public String buildMark() {
        return null;
    }
}

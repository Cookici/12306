package com.lrh.project12306.biz.payservice.dto.base;

import com.lrh.project12306.biz.payservice.common.enums.PayChannelEnum;
import com.lrh.project12306.biz.payservice.common.enums.PayTradeTypeEnum;
import com.lrh.project12306.biz.payservice.common.enums.TradeStatusEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: AliRefundRequest
 * @Author: 63283
 * @Description: 支付宝退款请求入参
 * @Date: 2024/3/11 13:46
 */
@Data
@Accessors(chain = true)
public final class AliRefundRequest extends AbstractRefundRequest {
    /**
     * 支付金额
     */
    private BigDecimal payAmount;

    /**
     * 交易凭证号
     */
    private String tradeNo;

    @Override
    public AliRefundRequest getAliRefundRequest() {
        return this;
    }

    @Override
    public String buildMark() {
        String mark = PayChannelEnum.ALI_PAY.name();
        if (getTradeType() != null) {
            mark = PayChannelEnum.ALI_PAY.name() + "_" + PayTradeTypeEnum.findNameByCode(getTradeType()) + "_" + TradeStatusEnum.TRADE_CLOSED.tradeCode();
        }
        return mark;
    }
}

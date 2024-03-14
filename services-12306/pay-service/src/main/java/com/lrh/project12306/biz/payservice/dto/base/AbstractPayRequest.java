package com.lrh.project12306.biz.payservice.dto.base;

import com.lrh.project12306.framework.starter.distributedid.toolkit.SnowflakeIdUtil;
import lombok.Getter;
import lombok.Setter;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: AbstractPayRequest
 * @Author: 63283
 * @Description: 抽象支付入参实体
 * @Date: 2024/3/11 12:47
 */

public abstract class AbstractPayRequest implements PayRequest  {
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

    /**
     * 商户订单号
     * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
     */
    @Getter
    @Setter
    private String orderRequestId = SnowflakeIdUtil.nextIdStr();

    @Override
    public AliPayRequest getAliPayRequest() {
        return null;
    }

    @Override
    public String getOrderRequestId() {
        return orderRequestId;
    }

    @Override
    public String buildMark() {
        return null;
    }
}

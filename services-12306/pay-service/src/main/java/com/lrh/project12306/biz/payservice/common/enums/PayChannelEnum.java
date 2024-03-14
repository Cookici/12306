package com.lrh.project12306.biz.payservice.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.common.enums
 * @ClassName: PayChannelEnum
 * @Author: 63283
 * @Description: 支付渠道枚举
 * @Date: 2024/3/11 12:21
 */
@RequiredArgsConstructor
public enum PayChannelEnum {

    /**
     * 支付宝
     */
    ALI_PAY(0, "ALI_PAY", "支付宝");

    @Getter
    private final Integer code;

    @Getter
    private final String name;

    @Getter
    private final String value;
}

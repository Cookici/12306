package com.lrh.project12306.biz.payservice.dto.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: AbstractPayCallbackRequest
 * @Author: 63283
 * @Description: 抽象支付回调入参实体
 * @Date: 2024/3/11 12:47
 */

public abstract class AbstractPayCallbackRequest implements PayCallbackRequest{
    @Getter
    @Setter
    private String orderRequestId;

    @Override
    public AliPayCallbackRequest getAliPayCallBackRequest() {
        return null;
    }

    @Override
    public String buildMark() {
        return null;
    }
}

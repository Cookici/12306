package com.lrh.project12306.biz.payservice.convert;

import com.lrh.project12306.biz.payservice.common.enums.PayChannelEnum;
import com.lrh.project12306.biz.payservice.dto.RefundCommand;
import com.lrh.project12306.biz.payservice.dto.base.AliRefundRequest;
import com.lrh.project12306.biz.payservice.dto.base.RefundRequest;
import com.lrh.project12306.framework.starter.common.toolkit.BeanUtil;

import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.convert
 * @ClassName: RefundRequestConvert
 * @Author: 63283
 * @Description: 退款请求入参转换器
 * @Date: 2024/3/11 12:26
 */

public class RefundRequestConvert {
    /**
     * {@link RefundCommand} to {@link RefundRequest}
     *
     * @param refundCommand 退款请求参数
     * @return {@link RefundRequest}
     */
    public static RefundRequest command2RefundRequest(RefundCommand refundCommand) {
        RefundRequest refundRequest = null;
        if (Objects.equals(refundCommand.getChannel(), PayChannelEnum.ALI_PAY.getCode())) {
            refundRequest = BeanUtil.convert(refundCommand, AliRefundRequest.class);
        }
        return refundRequest;
    }
}

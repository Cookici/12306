package com.lrh.project12306.biz.payservice.dto.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: RefundResponse
 * @Author: 63283
 * @Description: 退款返回
 * @Date: 2024/3/11 13:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RefundResponse {

    /**
     * 退款状态
     */
    private Integer status;

    /**
     * 第三方交易凭证
     */
    private String tradeNo;
}

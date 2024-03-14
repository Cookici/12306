package com.lrh.project12306.biz.payservice.dto.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto.base
 * @ClassName: PayResponse
 * @Author: 63283
 * @Description: 支付返回
 * @Date: 2024/3/11 13:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class PayResponse {
    /**
     * 调用支付返回信息
     */
    private String body;
}

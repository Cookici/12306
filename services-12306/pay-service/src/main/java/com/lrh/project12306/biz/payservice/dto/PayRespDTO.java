package com.lrh.project12306.biz.payservice.dto;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: PayRespDTO
 * @Author: 63283
 * @Description: 支付返回实体
 * @Date: 2024/3/11 13:50
 */
@Data
public final class PayRespDTO {
    /**
     * 调用支付返回信息
     */
    private String body;
}

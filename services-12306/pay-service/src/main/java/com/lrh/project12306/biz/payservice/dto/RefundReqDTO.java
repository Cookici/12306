package com.lrh.project12306.biz.payservice.dto;

import com.lrh.project12306.biz.payservice.common.enums.RefundTypeEnum;
import lombok.Data;
import com.lrh.project12306.biz.payservice.remote.dto.TicketOrderPassengerDetailRespDTO;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: RefundReqDTO
 * @Author: 63283
 * @Description: 退款请求入参数实体
 * @Date: 2024/3/11 13:51
 */
@Data
public class RefundReqDTO {
    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型枚举
     */
    private RefundTypeEnum refundTypeEnum;

    /**
     * 退款金额
     */
    private Integer refundAmount;

    /**
     * 部分退款车票详情集合
     */
    private List<TicketOrderPassengerDetailRespDTO> refundDetailReqDTOList;
}

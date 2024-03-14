package com.lrh.project12306.biz.payservice.dto;

import com.lrh.project12306.biz.payservice.remote.dto.TicketOrderPassengerDetailRespDTO;
import lombok.Data;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dto
 * @ClassName: RefundCreateDTO
 * @Author: 63283
 * @Description: 退款创建入参数实体
 * @Date: 2024/3/11 13:51
 */
@Data
public class RefundCreateDTO {
    /**
     * 支付流水号
     */
    private String paySn;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型
     */
    private Integer type;

    /**
     * 部分退款车票详情集合
     */
    private List<TicketOrderPassengerDetailRespDTO> refundDetailReqDTOList;
}

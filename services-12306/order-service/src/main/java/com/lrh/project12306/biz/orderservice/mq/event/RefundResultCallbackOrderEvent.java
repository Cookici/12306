package com.lrh.project12306.biz.orderservice.mq.event;

import com.lrh.project12306.biz.orderservice.common.enums.RefundTypeEnum;
import com.lrh.project12306.biz.orderservice.dto.resp.TicketOrderPassengerDetailRespDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.mq.event
 * @ClassName: RefundResultCallbackOrderEvent
 * @Author: 63283
 * @Description: 退款结果回调订单服务事件
 * @Date: 2024/3/11 11:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class RefundResultCallbackOrderEvent {
    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型枚举
     */
    private RefundTypeEnum refundTypeEnum;

    /**
     * 部分退款车票详情
     */
    private List<TicketOrderPassengerDetailRespDTO> partialRefundTicketDetailList;
}

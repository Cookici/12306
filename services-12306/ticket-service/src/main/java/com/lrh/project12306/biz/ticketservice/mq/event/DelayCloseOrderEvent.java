package com.lrh.project12306.biz.ticketservice.mq.event;

import com.lrh.project12306.biz.ticketservice.service.handler.ticket.dto.TrainPurchaseTicketRespDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.mq.event
 * @ClassName: DelayCloseOrderEvent
 * @Author: 63283
 * @Description: 延迟关闭订单事件
 * @Date: 2024/3/7 23:13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DelayCloseOrderEvent {
    /**
     * 车次 ID
     */
    private String trainId;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 乘车人购票信息
     */
    private List<TrainPurchaseTicketRespDTO> trainPurchaseTicketResults;
}
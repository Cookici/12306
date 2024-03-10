package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.refund;

import com.lrh.project12306.biz.ticketservice.common.enums.TicketChainMarkEnum;
import com.lrh.project12306.biz.ticketservice.dto.req.RefundTicketReqDTO;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.refund
 * @ClassName: TrainRefundTicketChainFilter
 * @Author: 63283
 * @Description: 列车车票退款过滤器
 * @Date: 2024/3/7 23:09
 */

public interface TrainRefundTicketChainFilter<T extends RefundTicketReqDTO> extends AbstractChainHandler<RefundTicketReqDTO> {

    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_REFUND_TICKET_FILTER.name();
    }
}

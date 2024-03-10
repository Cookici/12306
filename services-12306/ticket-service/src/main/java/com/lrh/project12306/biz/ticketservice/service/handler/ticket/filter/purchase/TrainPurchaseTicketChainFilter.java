package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.purchase;

import com.lrh.project12306.biz.ticketservice.common.enums.TicketChainMarkEnum;
import com.lrh.project12306.biz.ticketservice.dto.req.PurchaseTicketReqDTO;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.purchase
 * @ClassName: TrainPurchaseTicketChainFilter
 * @Author: 63283
 * @Description: 列车购买车票过滤器
 * @Date: 2024/3/7 23:04
 */

public interface TrainPurchaseTicketChainFilter<T extends PurchaseTicketReqDTO> extends AbstractChainHandler<PurchaseTicketReqDTO> {

    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_PURCHASE_TICKET_FILTER.name();
    }
}

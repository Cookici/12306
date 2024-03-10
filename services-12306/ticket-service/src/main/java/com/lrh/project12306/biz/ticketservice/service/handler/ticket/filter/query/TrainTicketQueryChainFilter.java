package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query;

import com.lrh.project12306.biz.ticketservice.common.enums.TicketChainMarkEnum;
import com.lrh.project12306.biz.ticketservice.dto.req.TicketPageQueryReqDTO;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query
 * @ClassName: TrainTicketQueryChainFilter
 * @Author: 63283
 * @Description: 列车车票查询过滤器
 * @Date: 2024/3/7 23:07
 */

public interface TrainTicketQueryChainFilter <T extends TicketPageQueryReqDTO> extends AbstractChainHandler<TicketPageQueryReqDTO> {
    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_QUERY_FILTER.name();
    }
}
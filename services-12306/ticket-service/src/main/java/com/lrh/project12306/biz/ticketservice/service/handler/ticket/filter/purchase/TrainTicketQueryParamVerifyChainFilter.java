package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.purchase;

import com.lrh.project12306.biz.ticketservice.dto.req.PurchaseTicketReqDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.purchase
 * @ClassName: TrainTicketQueryParamVerifyChainFilter
 * @Author: 63283
 * @Description: 购票流程过滤器之验证乘客是否重复购买
 * @Date: 2024/3/7 23:06
 */
@Component
@RequiredArgsConstructor
public class TrainTicketQueryParamVerifyChainFilter implements TrainPurchaseTicketChainFilter<PurchaseTicketReqDTO> {
    @Override
    public void handler(PurchaseTicketReqDTO requestParam) {
        // TODO 重复购买验证后续实现
    }

    @Override
    public int getOrder() {
        return 30;
    }
}

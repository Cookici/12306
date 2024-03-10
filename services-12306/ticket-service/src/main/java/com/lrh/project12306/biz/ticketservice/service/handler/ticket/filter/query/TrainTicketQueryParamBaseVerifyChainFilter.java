package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query;

import com.lrh.project12306.biz.ticketservice.dto.req.TicketPageQueryReqDTO;
import com.lrh.project12306.framework.starter.convention.exception.ClientException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query
 * @ClassName: TrainTicketQueryParamBaseVerifyChainFilter
 * @Author: 63283
 * @Description: 查询列车车票流程过滤器之基础数据验证
 * @Date: 2024/3/7 23:07
 */
@Component
@RequiredArgsConstructor
public class TrainTicketQueryParamBaseVerifyChainFilter implements TrainTicketQueryChainFilter<TicketPageQueryReqDTO>  {
    @Override
    public void handler(TicketPageQueryReqDTO requestParam) {
        if (requestParam.getDepartureDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().isBefore(LocalDate.now())) {
            throw new ClientException("出发日期不能小于当前日期");
        }
        if (Objects.equals(requestParam.getFromStation(), requestParam.getToStation())) {
            throw new ClientException("出发地和目的地不能相同");
        }
    }

    @Override
    public int getOrder() {
        return 10;
    }
}

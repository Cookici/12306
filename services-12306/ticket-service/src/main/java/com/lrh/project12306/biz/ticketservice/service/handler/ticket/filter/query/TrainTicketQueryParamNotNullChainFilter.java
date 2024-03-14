package com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query;

import cn.hutool.core.util.StrUtil;
import com.lrh.project12306.biz.ticketservice.dto.req.TicketPageQueryReqDTO;
import com.lrh.project12306.framework.starter.convention.exception.ClientException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.filter.query
 * @ClassName: TrainTicketQueryParamNotNullChainFilter
 * @Author: 63283
 * @Description: 查询列车车票流程过滤器之验证数据是否为空或空的字符串
 * @Date: 2024/3/7 23:08
 */
@Component
public class TrainTicketQueryParamNotNullChainFilter implements TrainTicketQueryChainFilter<TicketPageQueryReqDTO>{
    @Override
    public void handler(TicketPageQueryReqDTO requestParam) {
        if (StrUtil.isBlank(requestParam.getFromStation())) {
            throw new ClientException("出发地不能为空");
        }
        if (StrUtil.isBlank(requestParam.getToStation())) {
            throw new ClientException("目的地不能为空");
        }
        if (requestParam.getDepartureDate() == null) {
            throw new ClientException("出发日期不能为空");
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

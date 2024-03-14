package com.lrh.project12306.biz.payservice.remote;

import com.lrh.project12306.biz.payservice.remote.dto.TicketOrderDetailRespDTO;
import com.lrh.project12306.framework.starter.convention.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.remote
 * @ClassName: TicketOrderRemoteService
 * @Author: 63283
 * @Description: 车票订单远程服务调用
 * @Date: 2024/3/11 13:54
 */
@FeignClient(value = "index12306-order${unique-name:}-service", url = "${aggregation.remote-url:}")
public interface TicketOrderRemoteService {
    /**
     * 跟据订单号查询车票订单
     *
     * @param orderSn 列车订单号
     * @return 列车订单记录
     */
    @GetMapping("/api/order-service/order/ticket/query")
    Result<TicketOrderDetailRespDTO> queryTicketOrderByOrderSn(@RequestParam(value = "orderSn") String orderSn);
}

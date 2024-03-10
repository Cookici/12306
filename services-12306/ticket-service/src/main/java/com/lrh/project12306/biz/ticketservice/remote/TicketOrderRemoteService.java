package com.lrh.project12306.biz.ticketservice.remote;

import com.lrh.project12306.biz.ticketservice.dto.req.CancelTicketOrderReqDTO;
import com.lrh.project12306.biz.ticketservice.dto.req.TicketOrderItemQueryReqDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.TicketOrderCreateRemoteReqDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.TicketOrderDetailRespDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.TicketOrderPassengerDetailRespDTO;
import com.lrh.project12306.framework.starter.convention.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.remote
 * @ClassName: TicketOrderRemoteService
 * @Author: 63283
 * @Description: 车票订单远程服务调用
 * @Date: 2024/3/7 22:50
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


    /**
     * 跟据子订单记录id查询车票子订单详情
     */
    @GetMapping("/api/order-service/order/item/ticket/query")
    Result<List<TicketOrderPassengerDetailRespDTO>> queryTicketItemOrderById(@SpringQueryMap TicketOrderItemQueryReqDTO requestParam);

    /**
     * 创建车票订单
     *
     * @param requestParam 创建车票订单请求参数
     * @return 订单号
     */
    @PostMapping("/api/order-service/order/ticket/create")
    Result<String> createTicketOrder(@RequestBody TicketOrderCreateRemoteReqDTO requestParam);

    /**
     * 车票订单关闭
     *
     * @param requestParam 车票订单关闭入参
     * @return 关闭订单返回结果
     */
    @PostMapping("/api/order-service/order/ticket/close")
    Result<Boolean> closeTickOrder(@RequestBody CancelTicketOrderReqDTO requestParam);

    /**
     * 车票订单取消
     *
     * @param requestParam 车票订单取消入参
     * @return 订单取消返回结果
     */
    @PostMapping("/api/order-service/order/ticket/cancel")
    Result<Void> cancelTicketOrder(@RequestBody CancelTicketOrderReqDTO requestParam);
}

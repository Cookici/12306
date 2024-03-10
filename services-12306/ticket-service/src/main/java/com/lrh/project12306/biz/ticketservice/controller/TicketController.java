package com.lrh.project12306.biz.ticketservice.controller;

import com.lrh.project12306.biz.ticketservice.dto.req.CancelTicketOrderReqDTO;
import com.lrh.project12306.biz.ticketservice.dto.req.PurchaseTicketReqDTO;
import com.lrh.project12306.biz.ticketservice.dto.req.RefundTicketReqDTO;
import com.lrh.project12306.biz.ticketservice.dto.req.TicketPageQueryReqDTO;
import com.lrh.project12306.biz.ticketservice.dto.resp.RefundTicketRespDTO;
import com.lrh.project12306.biz.ticketservice.dto.resp.TicketPageQueryRespDTO;
import com.lrh.project12306.biz.ticketservice.dto.resp.TicketPurchaseRespDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.PayInfoRespDTO;
import com.lrh.project12306.biz.ticketservice.service.TicketService;
import com.lrh.project12306.framework.starter.convention.result.Result;
import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentSceneEnum;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentTypeEnum;
import com.lrh.project12306.framework.starter.log.annotation.ILog;
import com.lrh.project12306.framework.starter.web.Results;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.controller
 * @ClassName: TicketController
 * @Author: 63283
 * @Description: 车票控制层
 * @Date: 2024/3/7 22:10
 */
@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    /**
     * 根据条件查询车票
     */
    @GetMapping("/api/ticket-service/ticket/query")
    public Result<TicketPageQueryRespDTO> pageListTicketQuery(TicketPageQueryReqDTO requestParam) {
        return Results.success(ticketService.pageListTicketQueryV1(requestParam));
    }

    /**
     * 购买车票
     */
    @ILog
    @Idempotent(
            uniqueKeyPrefix = "index12306-ticket:lock_purchase-tickets:",
            key = "T(org.opengoofy.index12306.framework.starter.bases.ApplicationContextHolder).getBean('environment').getProperty('unique-name', '')"
                    + "+'_'+"
                    + "T(org.opengoofy.index12306.frameworks.starter.user.core.UserContext).getUsername()",
            message = "正在执行下单流程，请稍后...",
            scene = IdempotentSceneEnum.RESTAPI,
            type = IdempotentTypeEnum.SPEL
    )
    @PostMapping("/api/ticket-service/ticket/purchase")
    public Result<TicketPurchaseRespDTO> purchaseTickets(@RequestBody PurchaseTicketReqDTO requestParam) {
        return Results.success(ticketService.purchaseTicketsV1(requestParam));
    }

    /**
     * 购买车票v2
     */
    @ILog
    @Idempotent(
            uniqueKeyPrefix = "index12306-ticket:lock_purchase-tickets:",
            key = "T(org.opengoofy.index12306.framework.starter.bases.ApplicationContextHolder).getBean('environment').getProperty('unique-name', '')"
                    + "+'_'+"
                    + "T(org.opengoofy.index12306.frameworks.starter.user.core.UserContext).getUsername()",
            message = "正在执行下单流程，请稍后...",
            scene = IdempotentSceneEnum.RESTAPI,
            type = IdempotentTypeEnum.SPEL
    )
    @PostMapping("/api/ticket-service/ticket/purchase/v2")
    public Result<TicketPurchaseRespDTO> purchaseTicketsV2(@RequestBody PurchaseTicketReqDTO requestParam) {
        return Results.success(ticketService.purchaseTicketsV2(requestParam));
    }

    /**
     * 取消车票订单
     */
    @ILog
    @PostMapping("/api/ticket-service/ticket/cancel")
    public Result<Void> cancelTicketOrder(@RequestBody CancelTicketOrderReqDTO requestParam) {
        ticketService.cancelTicketOrder(requestParam);
        return Results.success();
    }

    /**
     * 支付单详情查询
     */
    @GetMapping("/api/ticket-service/ticket/pay/query")
    public Result<PayInfoRespDTO> getPayInfo(@RequestParam(value = "orderSn") String orderSn) {
        return Results.success(ticketService.getPayInfo(orderSn));
    }

    /**
     * 公共退款接口
     */
    @PostMapping("/api/ticket-service/ticket/refund")
    public Result<RefundTicketRespDTO> commonTicketRefund(@RequestBody RefundTicketReqDTO requestParam) {
        return Results.success(ticketService.commonTicketRefund(requestParam));
    }
}

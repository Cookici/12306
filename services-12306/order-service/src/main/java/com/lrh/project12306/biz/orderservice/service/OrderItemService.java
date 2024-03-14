package com.lrh.project12306.biz.orderservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lrh.project12306.biz.orderservice.dao.entity.OrderItemDO;
import com.lrh.project12306.biz.orderservice.dto.domain.OrderItemStatusReversalDTO;
import com.lrh.project12306.biz.orderservice.dto.req.TicketOrderItemQueryReqDTO;
import com.lrh.project12306.biz.orderservice.dto.resp.TicketOrderPassengerDetailRespDTO;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.service
 * @ClassName: OrderItemService
 * @Author: 63283
 * @Description: 订单明细接口层
 * @Date: 2024/3/11 11:54
 */

public interface OrderItemService extends IService<OrderItemDO> {
    /**
     * 子订单状态反转
     *
     * @param requestParam 请求参数
     */
    void orderItemStatusReversal(OrderItemStatusReversalDTO requestParam);

    /**
     * 根据子订单记录id查询车票子订单详情
     *
     * @param requestParam 请求参数
     */
    List<TicketOrderPassengerDetailRespDTO> queryTicketItemOrderById(TicketOrderItemQueryReqDTO requestParam);
}

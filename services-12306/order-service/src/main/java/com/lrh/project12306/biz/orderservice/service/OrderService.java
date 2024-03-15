/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lrh.project12306.biz.orderservice.service;

import com.lrh.project12306.biz.orderservice.dto.domain.OrderStatusReversalDTO;
import com.lrh.project12306.biz.orderservice.dto.req.CancelTicketOrderReqDTO;
import com.lrh.project12306.biz.orderservice.dto.req.TicketOrderCreateReqDTO;
import com.lrh.project12306.biz.orderservice.dto.req.TicketOrderPageQueryReqDTO;
import com.lrh.project12306.biz.orderservice.dto.req.TicketOrderSelfPageQueryReqDTO;
import com.lrh.project12306.biz.orderservice.dto.resp.TicketOrderDetailRespDTO;
import com.lrh.project12306.biz.orderservice.dto.resp.TicketOrderDetailSelfRespDTO;
import com.lrh.project12306.biz.orderservice.mq.event.PayResultCallbackOrderEvent;
import com.lrh.project12306.framework.starter.convention.page.PageResponse;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.service
 * @ClassName: OrderService
 * @Author: 63283
 * @Description: 订单接口层
 * @Date: 2024/3/11 11:56
 */

public interface OrderService {
    /**
     * 跟据订单号查询车票订单
     *
     * @param orderSn 订单号
     * @return 订单详情
     */
    TicketOrderDetailRespDTO queryTicketOrderByOrderSn(String orderSn);

    /**
     * 跟据用户名分页查询车票订单
     *
     * @param requestParam 跟据用户 ID 分页查询对象
     * @return 订单分页详情
     */
    PageResponse<TicketOrderDetailRespDTO> pageTicketOrder(TicketOrderPageQueryReqDTO requestParam);

    /**
     * 创建火车票订单
     *
     * @param requestParam 商品订单入参
     * @return 订单号
     */
    String createTicketOrder(TicketOrderCreateReqDTO requestParam);

    /**
     * 关闭火车票订单
     *
     * @param requestParam 关闭火车票订单入参
     */
    boolean closeTickOrder(CancelTicketOrderReqDTO requestParam);

    /**
     * 取消火车票订单
     *
     * @param requestParam 取消火车票订单入参
     */
    boolean cancelTickOrder(CancelTicketOrderReqDTO requestParam);

    /**
     * 订单状态反转
     *
     * @param requestParam 请求参数
     */
    void statusReversal(OrderStatusReversalDTO requestParam);

    /**
     * 支付结果回调订单
     *
     * @param requestParam 请求参数
     */
    void payCallbackOrder(PayResultCallbackOrderEvent requestParam);

    /**
     * 查询本人车票订单
     *
     * @param requestParam 请求参数
     * @return 本人车票订单集合
     */
    PageResponse<TicketOrderDetailSelfRespDTO> pageSelfTicketOrder(TicketOrderSelfPageQueryReqDTO requestParam);
}

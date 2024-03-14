package com.lrh.project12306.biz.orderservice.mq.consumer;

import com.lrh.project12306.biz.orderservice.common.constant.OrderRocketMQConstant;
import com.lrh.project12306.biz.orderservice.common.enums.OrderItemStatusEnum;
import com.lrh.project12306.biz.orderservice.common.enums.OrderStatusEnum;
import com.lrh.project12306.biz.orderservice.dao.entity.OrderItemDO;
import com.lrh.project12306.biz.orderservice.dto.domain.OrderItemStatusReversalDTO;
import com.lrh.project12306.biz.orderservice.dto.resp.TicketOrderPassengerDetailRespDTO;
import com.lrh.project12306.biz.orderservice.mq.domain.MessageWrapper;
import com.lrh.project12306.biz.orderservice.mq.event.RefundResultCallbackOrderEvent;
import com.lrh.project12306.biz.orderservice.service.OrderItemService;
import com.lrh.project12306.framework.starter.common.toolkit.BeanUtil;
import com.lrh.project12306.framework.starter.idempotent.annotation.Idempotent;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentSceneEnum;
import com.lrh.project12306.framework.starter.idempotent.enums.IdempotentTypeEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.mq.consumer
 * @ClassName: RefundResultCallbackOrderConsumer
 * @Author: 63283
 * @Description: 退款结果回调订单消费者
 * @Date: 2024/3/11 11:39
 */
@Slf4j
@Component
@RequiredArgsConstructor
@RocketMQMessageListener(
        topic = OrderRocketMQConstant.PAY_GLOBAL_TOPIC_KEY,
        selectorExpression = OrderRocketMQConstant.REFUND_RESULT_CALLBACK_TAG_KEY,
        consumerGroup = OrderRocketMQConstant.REFUND_RESULT_CALLBACK_ORDER_CG_KEY
)
public class RefundResultCallbackOrderConsumer implements RocketMQListener<MessageWrapper<RefundResultCallbackOrderEvent>> {
    private final OrderItemService orderItemService;

    @Idempotent(
            uniqueKeyPrefix = "index12306-order:refund_result_callback:",
            key = "#message.getKeys()+'_'+#message.hashCode()",
            type = IdempotentTypeEnum.SPEL,
            scene = IdempotentSceneEnum.MQ,
            keyTimeout = 7200L
    )
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void onMessage(MessageWrapper<RefundResultCallbackOrderEvent> message) {
        RefundResultCallbackOrderEvent refundResultCallbackOrderEvent = message.getMessage();
        Integer status = refundResultCallbackOrderEvent.getRefundTypeEnum().getCode();
        String orderSn = refundResultCallbackOrderEvent.getOrderSn();
        List<OrderItemDO> orderItemDOList = new ArrayList<>();
        List<TicketOrderPassengerDetailRespDTO> partialRefundTicketDetailList = refundResultCallbackOrderEvent.getPartialRefundTicketDetailList();
        partialRefundTicketDetailList.forEach(partial -> {
            OrderItemDO orderItemDO = new OrderItemDO();
            BeanUtil.convert(partial, orderItemDO);
            orderItemDOList.add(orderItemDO);
        });
        if (status.equals(OrderStatusEnum.PARTIAL_REFUND.getStatus())) {
            OrderItemStatusReversalDTO partialRefundOrderItemStatusReversalDTO = OrderItemStatusReversalDTO.builder()
                    .orderSn(orderSn)
                    .orderStatus(OrderStatusEnum.PARTIAL_REFUND.getStatus())
                    .orderItemStatus(OrderItemStatusEnum.REFUNDED.getStatus())
                    .orderItemDOList(orderItemDOList)
                    .build();
            orderItemService.orderItemStatusReversal(partialRefundOrderItemStatusReversalDTO);
        } else if (status.equals(OrderStatusEnum.FULL_REFUND.getStatus())) {
            OrderItemStatusReversalDTO fullRefundOrderItemStatusReversalDTO = OrderItemStatusReversalDTO.builder()
                    .orderSn(orderSn)
                    .orderStatus(OrderStatusEnum.FULL_REFUND.getStatus())
                    .orderItemStatus(OrderItemStatusEnum.REFUNDED.getStatus())
                    .orderItemDOList(orderItemDOList)
                    .build();
            orderItemService.orderItemStatusReversal(fullRefundOrderItemStatusReversalDTO);
        }
    }
}

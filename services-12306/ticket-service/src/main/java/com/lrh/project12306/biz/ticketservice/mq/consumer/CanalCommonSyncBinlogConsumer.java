package com.lrh.project12306.biz.ticketservice.mq.consumer;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.lrh.project12306.biz.ticketservice.common.constant.TicketRocketMQConstant;
import com.lrh.project12306.biz.ticketservice.common.enums.CanalExecuteStrategyMarkEnum;
import com.lrh.project12306.framework.starter.designpattern.strategy.AbstractStrategyChoose;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.mq.consumer
 * @ClassName: CanalCommonSyncBinlogConsumer
 * @Author: 63283
 * @Description: 列车车票余量缓存更新消费端
 * @Date: 2024/3/7 22:42
 */
@Slf4j
@Component
@RequiredArgsConstructor
@RocketMQMessageListener(
        topic = TicketRocketMQConstant.CANAL_COMMON_SYNC_TOPIC_KEY,
        consumerGroup = TicketRocketMQConstant.CANAL_COMMON_SYNC_CG_KEY
)
public class CanalCommonSyncBinlogConsumer implements RocketMQListener<CanalBinlogEvent> {
    private final AbstractStrategyChoose abstractStrategyChoose;

    @Value("${ticket.availability.cache-update.type:}")
    private String ticketAvailabilityCacheUpdateType;

    @Override
    public void onMessage(CanalBinlogEvent message) {
        // 余票 Binlog 更新延迟问题如何解决？详情查看：https://nageoffer.com/12306/question
        if (message.getIsDdl()
                || CollUtil.isEmpty(message.getOld())
                || !Objects.equals("UPDATE", message.getType())
                || !StrUtil.equals(ticketAvailabilityCacheUpdateType, "binlog")) {
            return;
        }
        abstractStrategyChoose.chooseAndExecute(
                message.getTable(),
                message,
                CanalExecuteStrategyMarkEnum.isPatternMatch(message.getTable())
        );
    }
}

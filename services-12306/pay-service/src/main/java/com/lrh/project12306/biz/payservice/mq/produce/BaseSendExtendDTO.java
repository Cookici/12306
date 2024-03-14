package com.lrh.project12306.biz.payservice.mq.produce;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.mq.procuce
 * @ClassName: BaseSendExtendDTO
 * @Author: 63283
 * @Description: 消息发送事件基础扩充属性实体
 * @Date: 2024/3/11 14:16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class BaseSendExtendDTO {

    /**
     * 事件名称
     */
    private String eventName;

    /**
     * 主题
     */
    private String topic;

    /**
     * 标签
     */
    private String tag;

    /**
     * 业务标识
     */
    private String keys;

    /**
     * 发送消息超时时间
     */
    private Long sentTimeout;
}

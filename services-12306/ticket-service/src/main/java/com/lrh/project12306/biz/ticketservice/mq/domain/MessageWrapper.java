package com.lrh.project12306.biz.ticketservice.mq.domain;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.mq.domain
 * @ClassName: MessageWrapper
 * @Author: 63283
 * @Description: 消息体包装器
 * @Date: 2024/3/7 23:13
 */
@Data
@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class MessageWrapper<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 消息发送 Keys
     */
    @NonNull
    private String keys;

    /**
     * 消息体
     */
    @NonNull
    private T message;

    /**
     * 唯一标识，用于客户端幂等验证
     */
    private String uuid = UUID.randomUUID().toString();

    /**
     * 消息发送时间
     */
    private Long timestamp = System.currentTimeMillis();
}

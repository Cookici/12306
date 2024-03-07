package com.lrh.project12306.framework.starter.idempotent.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.enums
 * @ClassName: IdempotentMQConsumeStatusEnum
 * @Author: 63283
 * @Description: 幂等 MQ 消费状态枚举
 * @Date: 2024/3/7 10:55
 */
@RequiredArgsConstructor
public enum IdempotentMQConsumeStatusEnum {
    /**
     * 消费中
     */
    CONSUMING("0"),

    /**
     * 已消费
     */
    CONSUMED("1");

    @Getter
    private final String code;

    /**
     * 如果消费状态等于消费中，返回失败
     *
     * @param consumeStatus 消费状态
     * @return 是否消费失败
     */
    public static boolean isError(String consumeStatus) {
        return Objects.equals(CONSUMING.code, consumeStatus);
    }
}

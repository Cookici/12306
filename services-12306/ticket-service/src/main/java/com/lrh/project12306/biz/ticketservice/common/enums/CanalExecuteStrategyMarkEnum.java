package com.lrh.project12306.biz.ticketservice.common.enums;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.common.enums
 * @ClassName: CanalExecuteStrategyMarkEnum
 * @Author: 63283
 * @Description: Canal 执行策略标记枚举
 * @Date: 2024/3/7 21:59
 */

@RequiredArgsConstructor
public enum CanalExecuteStrategyMarkEnum {

    /**
     * 座位表
     */
    T_SEAT("t_seat", null),

    /**
     * 订单表
     */
    T_ORDER("t_order", "^t_order_([0-9]+|1[0-6])");

    @Getter
    private final String actualTable;

    @Getter
    private final String patternMatchTable;

    public static boolean isPatternMatch(String tableName) {
        return Arrays.stream(CanalExecuteStrategyMarkEnum.values())
                .anyMatch(each -> StrUtil.isNotBlank(each.getPatternMatchTable()) && Pattern.compile(each.getPatternMatchTable()).matcher(tableName).matches());
    }

    public static String getPatternMatch(String tableName) {
        return Arrays.stream(CanalExecuteStrategyMarkEnum.values())
                .filter(each -> Objects.equals(tableName, each.getActualTable()))
                .findFirst()
                .map(CanalExecuteStrategyMarkEnum::getPatternMatchTable)
                .orElse(null);
    }
}

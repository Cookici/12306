package com.lrh.project12306.biz.ticketservice.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.common.enums
 * @ClassName: SourceEnum
 * @Author: 63283
 * @Description: 购票来源
 * @Date: 2024/3/7 21:59
 */

@RequiredArgsConstructor
public enum SourceEnum {

    /**
     * 互联网购票
     */
    INTERNET(0),

    /**
     * 线下窗口购票
     */
    OFFLINE(1);

    @Getter
    private final Integer code;
}

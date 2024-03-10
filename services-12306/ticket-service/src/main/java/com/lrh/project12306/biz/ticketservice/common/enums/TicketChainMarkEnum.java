package com.lrh.project12306.biz.ticketservice.common.enums;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.common.enums
 * @ClassName: TicketChainMarkEnum
 * @Author: 63283
 * @Description: 购票相关责任链 Mark 枚举
 * @Date: 2024/3/7 21:59
 */


public enum TicketChainMarkEnum {

    /**
     * 车票查询过滤器
     */
    TRAIN_QUERY_FILTER,

    /**
     * 车票购买过滤器
     */
    TRAIN_PURCHASE_TICKET_FILTER,

    /**
     * 车票退款过滤器
     */
    TRAIN_REFUND_TICKET_FILTER
}

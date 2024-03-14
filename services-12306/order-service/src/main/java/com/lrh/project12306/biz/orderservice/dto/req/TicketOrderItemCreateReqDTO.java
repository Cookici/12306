package com.lrh.project12306.biz.orderservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.req
 * @ClassName: TicketOrderItemCreateReqDTO
 * @Author: 63283
 * @Description: 车票订单详情创建请求参数
 * @Date: 2024/3/11 11:34
 */
@Data
public class TicketOrderItemCreateReqDTO {
    /**
     * 车厢号
     */
    private String carriageNumber;

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 乘车人 ID
     */
    private String passengerId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号
     */
    private String idCard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 订单金额
     */
    private Integer amount;

    /**
     * 车票类型
     */
    private Integer ticketType;
}

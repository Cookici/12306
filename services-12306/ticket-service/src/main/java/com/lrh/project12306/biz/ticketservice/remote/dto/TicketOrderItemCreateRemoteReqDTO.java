package com.lrh.project12306.biz.ticketservice.remote.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.remote.dto
 * @ClassName: TicketOrderItemCreateRemoteReqDTO
 * @Author: 63283
 * @Description: 车票订单详情创建请求参数
 * @Date: 2024/3/7 22:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketOrderItemCreateRemoteReqDTO {
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

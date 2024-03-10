package com.lrh.project12306.biz.ticketservice.service.handler.ticket.dto;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.dto
 * @ClassName: TrainPurchaseTicketRespDTO
 * @Author: 63283
 * @Description: 列车购票出参
 * @Date: 2024/3/7 23:04
 */
@Data
public class TrainPurchaseTicketRespDTO {
    /**
     * 乘车人 ID
     */
    private String passengerId;

    /**
     * 乘车人姓名
     */
    private String realName;

    /**
     * 乘车人证件类型
     */
    private Integer idType;

    /**
     * 乘车人证件号
     */
    private String idCard;

    /**
     * 乘车人手机号
     */
    private String phone;

    /**
     * 用户类型 0：成人 1：儿童 2：学生 3：残疾军人
     */
    private Integer userType;

    /**
     * 席别类型
     */
    private Integer seatType;

    /**
     * 车厢号
     */
    private String carriageNumber;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 座位金额
     */
    private Integer amount;
}

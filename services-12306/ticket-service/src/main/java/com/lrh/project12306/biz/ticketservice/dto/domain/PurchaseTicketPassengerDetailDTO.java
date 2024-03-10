package com.lrh.project12306.biz.ticketservice.dto.domain;

import lombok.Data;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: PurchaseTicketPassengerDetailDTO
 * @Author: 63283
 * @Description: 购票乘车人详情实体
 * @Date: 2024/3/7 22:29
 */

@Data
public class PurchaseTicketPassengerDetailDTO {

    /**
     * 乘车人 ID
     */
    private String passengerId;

    /**
     * 座位类型
     */
    private Integer seatType;
}

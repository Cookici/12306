package com.lrh.project12306.biz.ticketservice.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: TicketOrderDetailRespDTO
 * @Author: 63283
 * @Description: 车票订单详情返回参数
 * @Date: 2024/3/7 22:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketOrderDetailRespDTO {

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
     * 车票类型 0：成人 1：儿童 2：学生 3：残疾军人
     */
    private Integer ticketType;

    /**
     * 订单金额
     */
    private Integer amount;
}

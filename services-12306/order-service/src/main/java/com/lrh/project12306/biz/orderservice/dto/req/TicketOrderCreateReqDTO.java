package com.lrh.project12306.biz.orderservice.dto.req;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.req
 * @ClassName: TicketOrderCreateReqDTO
 * @Author: 63283
 * @Description: 车票订单创建请求参数
 * @Date: 2024/3/11 11:34
 */
@Data
public class TicketOrderCreateReqDTO {
    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 车次 ID
     */
    private Long trainId;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;

    /**
     * 订单来源
     */
    private Integer source;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 乘车日期
     */
    private Date ridingDate;

    /**
     * 列车车次
     */
    private String trainNumber;

    /**
     * 出发时间
     */
    private Date departureTime;

    /**
     * 到达时间
     */
    private Date arrivalTime;

    /**
     * 订单明细
     */
    private List<TicketOrderItemCreateReqDTO> ticketOrderItems;
}

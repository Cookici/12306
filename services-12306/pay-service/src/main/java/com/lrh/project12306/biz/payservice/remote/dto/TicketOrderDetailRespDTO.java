package com.lrh.project12306.biz.payservice.remote.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.remote.dto
 * @ClassName: TicketOrderDetailRespDTO
 * @Author: 63283
 * @Description: 车票订单详情返回参数
 * @Date: 2024/3/11 13:55
 */
@Data
public class TicketOrderDetailRespDTO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 列车 ID
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
     * 乘车日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date ridingDate;

    /**
     * 订票日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date orderTime;

    /**
     * 列车车次
     */
    private String trainNumber;

    /**
     * 出发时间
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date departureTime;

    /**
     * 到达时间
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date arrivalTime;

    /**
     * 乘车人订单详情
     */
    private List<TicketOrderPassengerDetailRespDTO> passengerDetails;
}

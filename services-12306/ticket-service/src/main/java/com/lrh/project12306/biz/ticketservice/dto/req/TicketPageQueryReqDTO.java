package com.lrh.project12306.biz.ticketservice.dto.req;

import java.util.Date;

import com.lrh.project12306.framework.starter.convention.page.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: TicketPageQueryReqDTO
 * @Author: 63283
 * @Description: 车票分页查询请求参数
 * @Date: 2024/3/7 22:29
 */
@Data
public class TicketPageQueryReqDTO extends PageRequest {

    /**
     * 出发地 Code
     */
    private String fromStation;

    /**
     * 目的地 Code
     */
    private String toStation;

    /**
     * 出发日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date departureDate;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;
}

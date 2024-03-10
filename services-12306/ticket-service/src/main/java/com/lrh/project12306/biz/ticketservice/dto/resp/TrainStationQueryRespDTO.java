package com.lrh.project12306.biz.ticketservice.dto.resp;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: TrainStationQueryRespDTO
 * @Author: 63283
 * @Description: 列车站点查询响应参数
 * @Date: 2024/3/7 22:29
 */

@Data
public class TrainStationQueryRespDTO {

    /**
     * 站序
     */
    private String sequence;

    /**
     * 站名
     */
    private String departure;

    /**
     * 到站时间
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date arrivalTime;

    /**
     * 出发时间
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date departureTime;

    /**
     * 停留时间
     */
    private Integer stopoverTime;
}

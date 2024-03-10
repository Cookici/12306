package com.lrh.project12306.biz.ticketservice.dto.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: TrainSeatBaseDTO
 * @Author: 63283
 * @Description: 高铁座位基础信息
 * @Date: 2024/3/7 22:29
 */

@Builder
@Data
@AllArgsConstructor
public class TrainSeatBaseDTO {

    /**
     * 高铁列车 ID
     */
    private String trainId;

    /**
     * 列车起始站点
     */
    private String departure;

    /**
     * 列车到达站点
     */
    private String arrival;

    /**
     * 乘客信息
     */
    private List<PurchaseTicketPassengerDetailDTO> passengerSeatDetails;

    /**
     * 选择座位信息
     */
    private List<String> chooseSeatList;
}

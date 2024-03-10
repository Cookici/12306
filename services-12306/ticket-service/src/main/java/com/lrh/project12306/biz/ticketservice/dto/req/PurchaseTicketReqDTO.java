package com.lrh.project12306.biz.ticketservice.dto.req;

import java.util.List;

import com.lrh.project12306.biz.ticketservice.dto.domain.PurchaseTicketPassengerDetailDTO;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: PurchaseTicketReqDTO
 * @Author: 63283
 * @Description: 购票请求入参
 * @Date: 2024/3/7 22:29
 */

@Data
public class PurchaseTicketReqDTO {

    /**
     * 车次 ID
     */
    private String trainId;

    /**
     * 乘车人
     */
    private List<PurchaseTicketPassengerDetailDTO> passengers;

    /**
     * 选择座位
     */
    private List<String> chooseSeats;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;
}

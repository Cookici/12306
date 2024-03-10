package com.lrh.project12306.biz.ticketservice.service.handler.ticket.dto;

import com.lrh.project12306.biz.ticketservice.dto.domain.PurchaseTicketPassengerDetailDTO;
import com.lrh.project12306.biz.ticketservice.dto.req.PurchaseTicketReqDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.handler.ticket.dto
 * @ClassName: SelectSeatDTO
 * @Author: 63283
 * @Description: 选择座位实体
 * @Date: 2024/3/7 23:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectSeatDTO {
    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 座位对应的乘车人集合
     */
    private List<PurchaseTicketPassengerDetailDTO> passengerSeatDetails;

    /**
     * 购票原始入参
     */
    private PurchaseTicketReqDTO requestParam;
}

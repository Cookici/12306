package com.lrh.project12306.biz.ticketservice.dto.resp;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: TicketPurchaseRespDTO
 * @Author: 63283
 * @Description: 车票购买返回参数
 * @Date: 2024/3/7 22:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketPurchaseRespDTO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 乘车人订单详情
     */
    private List<TicketOrderDetailRespDTO> ticketOrderDetails;
}

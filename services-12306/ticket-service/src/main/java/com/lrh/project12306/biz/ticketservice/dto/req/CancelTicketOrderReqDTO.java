package com.lrh.project12306.biz.ticketservice.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: CancelTicketOrderReqDTO
 * @Author: 63283
 * @Description: 取消车票订单请求入参
 * @Date: 2024/3/7 22:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancelTicketOrderReqDTO {

    /**
     * 订单号
     */
    private String orderSn;
}

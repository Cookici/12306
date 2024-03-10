package com.lrh.project12306.biz.ticketservice.dto.req;

import java.util.List;

import lombok.Data;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: RefundTicketReqDTO
 * @Author: 63283
 * @Description: 车票退款请求入参数实体
 * @Date: 2024/3/7 22:29
 */

@Data
public class RefundTicketReqDTO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型 0 部分退款 1 全部退款
     */
    private Integer type;

    /**
     * 部分退款子订单记录id集合
     */
    private List<String> subOrderRecordIdReqList;
}

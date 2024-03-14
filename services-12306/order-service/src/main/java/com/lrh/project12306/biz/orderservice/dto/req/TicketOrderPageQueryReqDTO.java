package com.lrh.project12306.biz.orderservice.dto.req;

import com.lrh.project12306.framework.starter.convention.page.PageRequest;
import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.dto.req
 * @ClassName: TicketOrderPageQueryReqDTO
 * @Author: 63283
 * @Description: 车票订单分页查询
 * @Date: 2024/3/11 11:35
 */
@Data
public class TicketOrderPageQueryReqDTO extends PageRequest {
    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 状态类型 0：未完成 1：未出行 2：历史订单
     */
    private Integer statusType;
}

package com.lrh.project12306.biz.ticketservice.dto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: RouteDTO
 * @Author: 63283
 * @Description: 站点路线实体
 * @Date: 2024/3/7 22:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteDTO {

    /**
     * 出发站点
     */
    private String startStation;

    /**
     * 目的站点
     */
    private String endStation;
}

package com.lrh.project12306.biz.ticketservice.dto.req;

import lombok.Data;


/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.req
 * @ClassName: RegionStationQueryReqDTO
 * @Author: 63283
 * @Description: 地区&站点查询请求入参
 * @Date: 2024/3/7 22:29
 */


@Data
public class RegionStationQueryReqDTO {

    /**
     * 查询方式
     */
    private Integer queryType;

    /**
     * 名称
     */
    private String name;
}

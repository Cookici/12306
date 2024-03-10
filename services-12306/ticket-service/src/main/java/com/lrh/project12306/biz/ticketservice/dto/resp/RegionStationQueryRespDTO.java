package com.lrh.project12306.biz.ticketservice.dto.resp;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: RegionStationQueryRespDTO
 * @Author: 63283
 * @Description: 地区&站点分页查询响应参数
 * @Date: 2024/3/7 22:29
 */
@Data
public class RegionStationQueryRespDTO {

    /**
     * 名称
     */
    private String name;

    /**
     * 地区编码
     */
    private String code;

    /**
     * 拼音
     */
    private String spell;
}

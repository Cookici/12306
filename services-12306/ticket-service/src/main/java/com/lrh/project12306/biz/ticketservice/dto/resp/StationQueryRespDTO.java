package com.lrh.project12306.biz.ticketservice.dto.resp;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: StationQueryRespDTO
 * @Author: 63283
 * @Description: 站点分页查询响应参数
 * @Date: 2024/3/7 22:29
 */
@Data
public class StationQueryRespDTO {

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

    /**
     * 城市名称
     */
    private String regionName;
}

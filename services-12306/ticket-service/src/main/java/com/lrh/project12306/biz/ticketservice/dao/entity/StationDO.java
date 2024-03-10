package com.lrh.project12306.biz.ticketservice.dao.entity;

import com.lrh.project12306.framework.starter.database.base.BaseDao;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: StationDO
 * @Author: 63283
 * @Description: 车站实体
 * @Date: 2024/3/7 22:13
 */
@Data
@TableName("t_station")
public class StationDO extends BaseDao {

    /**
     * id
     */
    private Long id;

    /**
     * 车站编码
     */
    private String code;

    /**
     * 车站名称
     */
    private String name;

    /**
     * 拼音
     */
    private String spell;

    /**
     * 地区编号
     */
    private String region;

    /**
     * 地区名称
     */
    private String regionName;
}

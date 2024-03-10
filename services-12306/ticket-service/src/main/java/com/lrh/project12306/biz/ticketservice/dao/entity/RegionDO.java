package com.lrh.project12306.biz.ticketservice.dao.entity;



import com.baomidou.mybatisplus.annotation.TableName;

import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: RegionDO
 * @Author: 63283
 * @Description: 地区表
 * @Date: 2024/3/7 22:13
 */
@Data
@TableName("t_region")
public class RegionDO extends BaseDao {

    /**
     * id
     */
    private Long id;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 地区全名
     */
    private String fullName;

    /**
     * 地区编码
     */
    private String code;

    /**
     * 地区首字母
     */
    private String initial;

    /**
     * 拼音
     */
    private String spell;

    /**
     * 热门标识
     */
    private Integer popularFlag;
}

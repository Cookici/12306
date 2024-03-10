package com.lrh.project12306.biz.ticketservice.dao.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: CarriageDO
 * @Author: 63283
 * @Description: 车厢实体
 * @Date: 2024/3/7 22:13
 */
@Data
@TableName("t_carriage")
public class CarriageDO extends BaseDao {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 列车id
     */
    private Long trainId;

    /**
     * 车厢号
     */
    private String carriageNumber;

    /**
     * 车厢类型
     */
    private Integer carriageType;

    /**
     * 座位数
     */
    private Integer seatCount;
}

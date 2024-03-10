package com.lrh.project12306.biz.ticketservice.dao.entity;

import com.lrh.project12306.framework.starter.database.base.BaseDao;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: TrainStationPriceDO
 * @Author: 63283
 * @Description: 列车站点价格实体
 * @Date: 2024/3/7 22:13
 */

@Data
@TableName("t_train_station_price")
public class TrainStationPriceDO extends BaseDao {

    /**
     * id
     */
    private Long id;

    /**
     * 车次id
     */
    private Long trainId;

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;

    /**
     * 车票价格
     */
    private Integer price;
}

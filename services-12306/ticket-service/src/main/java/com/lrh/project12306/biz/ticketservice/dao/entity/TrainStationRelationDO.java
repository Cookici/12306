package com.lrh.project12306.biz.ticketservice.dao.entity;

import java.util.Date;

import com.lrh.project12306.framework.starter.database.base.BaseDao;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: TrainStationRelationDO
 * @Author: 63283
 * @Description: 列车站点关系实体
 * @Date: 2024/3/7 22:13
 */

@Data
@TableName("t_train_station_relation")
public class TrainStationRelationDO extends BaseDao {

    /**
     * id
     */
    private Long id;

    /**
     * 车次id
     */
    private Long trainId;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;

    /**
     * 起始城市
     */
    private String startRegion;

    /**
     * 终点城市
     */
    private String endRegion;

    /**
     * 始发站标识
     */
    private Boolean departureFlag;

    /**
     * 终点站标识
     */
    private Boolean arrivalFlag;

    /**
     * 出发时间
     */
    private Date departureTime;

    /**
     * 到达时间
     */
    private Date arrivalTime;
}

package com.lrh.project12306.biz.ticketservice.dao.entity;

import java.util.Date;

import com.lrh.project12306.framework.starter.database.base.BaseDao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: TrainStationDO
 * @Author: 63283
 * @Description: 列车站点实体
 * @Date: 2024/3/7 22:13
 */

@Data
@TableName("t_train_station")
public class TrainStationDO extends BaseDao {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 车次id
     */
    private Long trainId;

    /**
     * 车站id
     */
    private Long stationId;

    /**
     * 站点顺序
     */
    private String sequence;

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
     * 到站时间
     */
    private Date arrivalTime;

    /**
     * 出站时间
     */
    private Date departureTime;

    /**
     * 停留时间，单位分
     */
    private Integer stopoverTime;
}

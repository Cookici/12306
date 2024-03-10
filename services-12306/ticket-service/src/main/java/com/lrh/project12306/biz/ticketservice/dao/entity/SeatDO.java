package com.lrh.project12306.biz.ticketservice.dao.entity;

import com.lrh.project12306.framework.starter.database.base.BaseDao;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.entity
 * @ClassName: SeatDO
 * @Author: 63283
 * @Description: 座位实体
 * @Date: 2024/3/7 22:13
 */
@Data
@TableName("t_seat")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SeatDO extends BaseDao {

    /**
     * id
     */
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
     * 座位号
     */
    private String seatNumber;

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 起始站
     */
    private String startStation;

    /**
     * 终点站
     */
    private String endStation;

    /**
     * 座位状态
     */
    private Integer seatStatus;

    /**
     * 车票价格
     */
    private Integer price;
}

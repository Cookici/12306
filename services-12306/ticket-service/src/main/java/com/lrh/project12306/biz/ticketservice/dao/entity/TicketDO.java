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
 * @ClassName: TicketDO
 * @Author: 63283
 * @Description: 车票实体
 * @Date: 2024/3/7 22:13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_ticket")
public class TicketDO extends BaseDao {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

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
     * 乘车人 ID
     */
    private String passengerId;

    /**
     * 车票状态
     */
    private Integer ticketStatus;
}

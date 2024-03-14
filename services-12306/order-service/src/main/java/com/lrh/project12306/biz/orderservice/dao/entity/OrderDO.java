package com.lrh.project12306.biz.orderservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: dao.entity
 * @ClassName: OrderDO
 * @Author: 63283
 * @Description: 订单数据库实体
 * @Date: 2024/3/11 10:25
 */
@Data
@TableName("t_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDO extends BaseDao {
    /**
     * id
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 列车id
     */
    private Long trainId;

    /**
     * 列车车次
     */
    private String trainNumber;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;

    /**
     * 订单来源
     */
    private Integer source;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 乘车日期
     */
    private Date ridingDate;

    /**
     * 出发时间
     */
    private Date departureTime;

    /**
     * 出发时间
     */
    private Date arrivalTime;
}

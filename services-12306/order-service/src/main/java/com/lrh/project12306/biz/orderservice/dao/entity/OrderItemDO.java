package com.lrh.project12306.biz.orderservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: dao.entity
 * @ClassName: OrderItemDO
 * @Author: 63283
 * @Description: 订单明细数据库实体
 * @Date: 2024/3/11 11:25
 */
@Data
@TableName("t_order_item")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDO extends BaseDao {
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
     * 车厢号
     */
    private String carriageNumber;

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 座位号
     */
    private String seatNumber;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号
     */
    private String idCard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单金额
     */
    private Integer amount;

    /**
     * 车票类型
     */
    private Integer ticketType;
}

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
 * @ClassName: OrderItemPassengerDO
 * @Author: 63283
 * @Description: 乘车人订单关系实体
 * @Date: 2024/3/11 11:25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_order_item_passenger")
public class OrderItemPassengerDO extends BaseDao {
    /**
     * id
     */
    private Long id;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号
     */
    private String idCard;
}

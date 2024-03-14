package com.lrh.project12306.biz.payservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.Data;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.dao.entity
 * @ClassName: PayDO
 * @Author: 63283
 * @Description: 支付实体
 * @Date: 2024/3/11 12:28
 */
@Data
@TableName("t_pay")
public class PayDO extends BaseDao {
    /**
     * id
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String paySn;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 商户订单号
     */
    private String outOrderSn;

    /**
     * 支付渠道
     */
    private Integer channel;

    /**
     * 支付环境
     */
    private Integer tradeType;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 交易凭证号
     */
    private String tradeNo;

    /**
     * 商户订单号
     * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
     */
    private String orderRequestId;

    /**
     * 交易总金额
     */
    private Integer totalAmount;

    /**
     * 付款时间
     */
    private Date gmtPayment;

    /**
     * 支付金额
     */
    private Integer payAmount;

    /**
     * 支付状态
     */
    private Integer status;
}

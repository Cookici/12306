package com.lrh.project12306.biz.orderservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lrh.project12306.biz.orderservice.dao.entity.OrderItemPassengerDO;
import com.lrh.project12306.biz.orderservice.dao.mapper.OrderItemPassengerMapper;
import com.lrh.project12306.biz.orderservice.service.OrderPassengerRelationService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.service.impl
 * @ClassName: OrderPassengerRelationServiceImpl
 * @Author: 63283
 * @Description: 乘车人订单关系接口层实现
 * @Date: 2024/3/11 11:50
 */
@Service
public class OrderPassengerRelationServiceImpl  extends ServiceImpl<OrderItemPassengerMapper, OrderItemPassengerDO> implements OrderPassengerRelationService {

}

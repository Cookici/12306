package com.lrh.project12306.biz.ticketservice.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.lrh.project12306.biz.ticketservice.dao.entity.SeatDO;
import com.lrh.project12306.biz.ticketservice.dto.domain.SeatTypeCountDTO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dao.mapper
 * @ClassName: SeatMapper
 * @Author: 63283
 * @Description: 座位持久层
 * @Date: 2024/3/7 22:21
 */

public interface SeatMapper extends BaseMapper<SeatDO> {

    /**
     * 获取列车车厢余票集合
     */
    List<Integer> listSeatRemainingTicket(@Param("seatDO") SeatDO seatDO, @Param("trainCarriageList") List<String> trainCarriageList);

    /**
     * 获取列车 startStation 到 endStation 区间可用座位集合
     */
    List<SeatTypeCountDTO> listSeatTypeCount(@Param("trainId") Long trainId, @Param("startStation") String startStation, @Param("endStation") String endStation, @Param("seatTypes")  List<Integer> seatTypes);
}

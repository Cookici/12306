package com.lrh.project12306.biz.ticketservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import com.lrh.project12306.biz.ticketservice.dao.entity.TrainStationDO;
import com.lrh.project12306.biz.ticketservice.dao.mapper.TrainStationMapper;
import com.lrh.project12306.biz.ticketservice.dto.domain.RouteDTO;
import com.lrh.project12306.biz.ticketservice.dto.resp.TrainStationQueryRespDTO;
import com.lrh.project12306.biz.ticketservice.service.TrainStationService;
import com.lrh.project12306.biz.ticketservice.toolkit.StationCalculateUtil;
import com.lrh.project12306.framework.starter.common.toolkit.BeanUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service.impl
 * @ClassName: TrainStationServiceImpl
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/7 23:36
 */
@Service
@RequiredArgsConstructor
public class TrainStationServiceImpl implements TrainStationService {
    private final TrainStationMapper trainStationMapper;

    @Override
    public List<TrainStationQueryRespDTO> listTrainStationQuery(String trainId) {
        LambdaQueryWrapper<TrainStationDO> queryWrapper = Wrappers.lambdaQuery(TrainStationDO.class)
                .eq(TrainStationDO::getTrainId, trainId);
        List<TrainStationDO> trainStationDOList = trainStationMapper.selectList(queryWrapper);
        return BeanUtil.convert(trainStationDOList, TrainStationQueryRespDTO.class);
    }

    @Override
    public List<RouteDTO> listTrainStationRoute(String trainId, String departure, String arrival) {
        LambdaQueryWrapper<TrainStationDO> queryWrapper = Wrappers.lambdaQuery(TrainStationDO.class)
                .eq(TrainStationDO::getTrainId, trainId)
                .select(TrainStationDO::getDeparture);
        List<TrainStationDO> trainStationDOList = trainStationMapper.selectList(queryWrapper);
        List<String> trainStationAllList = trainStationDOList.stream().map(TrainStationDO::getDeparture).collect(Collectors.toList());
        return StationCalculateUtil.throughStation(trainStationAllList, departure, arrival);
    }

    @Override
    public List<RouteDTO> listTakeoutTrainStationRoute(String trainId, String departure, String arrival) {
        LambdaQueryWrapper<TrainStationDO> queryWrapper = Wrappers.lambdaQuery(TrainStationDO.class)
                .eq(TrainStationDO::getTrainId, trainId)
                .select(TrainStationDO::getDeparture);
        List<TrainStationDO> trainStationDOList = trainStationMapper.selectList(queryWrapper);
        List<String> trainStationAllList = trainStationDOList.stream().map(TrainStationDO::getDeparture).collect(Collectors.toList());
        return StationCalculateUtil.takeoutStation(trainStationAllList, departure, arrival);
    }
}

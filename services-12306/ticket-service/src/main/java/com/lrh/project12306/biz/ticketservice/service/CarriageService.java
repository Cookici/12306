package com.lrh.project12306.biz.ticketservice.service;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.service
 * @ClassName: CarriageService
 * @Author: 63283
 * @Description: 列车车厢接口层
 * @Date: 2024/3/7 23:23
 */

public interface CarriageService {
    /**
     * 查询列车车厢号集合
     *
     * @param trainId      列车 ID
     * @param carriageType 车厢类型
     * @return 车厢号集合
     */
    List<String> listCarriageNumber(String trainId, Integer carriageType);
}

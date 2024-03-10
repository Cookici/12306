package com.lrh.project12306.biz.ticketservice.dto.resp;

import java.util.List;

import com.lrh.project12306.biz.ticketservice.dto.domain.TicketListDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.resp
 * @ClassName: TicketPageQueryRespDTO
 * @Author: 63283
 * @Description: 车票分页查询响应参数
 * @Date: 2024/3/7 22:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketPageQueryRespDTO {

    /**
     * 车次集合数据
     */
    private List<TicketListDTO> trainList;

    /**
     * 车次类型：D-动车 Z-直达 复兴号等
     */
    private List<Integer> trainBrandList;

    /**
     * 出发车站
     */
    private List<String> departureStationList;

    /**
     * 到达车站
     */
    private List<String> arrivalStationList;

    /**
     * 车次席别
     */
    private List<Integer> seatClassTypeList;
}

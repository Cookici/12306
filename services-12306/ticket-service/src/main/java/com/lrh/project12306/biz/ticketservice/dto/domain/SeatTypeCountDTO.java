package com.lrh.project12306.biz.ticketservice.dto.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: SeatTypeCountDTO
 * @Author: 63283
 * @Description: 座位类型和座位数量实体
 * @Date: 2024/3/7 22:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatTypeCountDTO {

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 座位类型 - 对应数量
     */
    private Integer seatCount;
}

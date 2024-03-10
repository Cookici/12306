package com.lrh.project12306.biz.ticketservice.dto.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: SeatClassDTO
 * @Author: 63283
 * @Description: 席别类型实体
 * @Date: 2024/3/7 22:29
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SeatClassDTO {

    /**
     * 席别类型
     */
    private Integer type;

    /**
     * 席别数量
     */
    private Integer quantity;

    /**
     * 席别价格
     */
    private BigDecimal price;

    /**
     * 席别候补标识
     */
    private Boolean candidate;
}


package com.lrh.project12306.biz.ticketservice.dto.domain;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.dto.domain
 * @ClassName: HighSpeedTrainDTO
 * @Author: 63283
 * @Description: 动车实体
 * @Date: 2024/3/7 22:29
 */

@Data
public class HighSpeedTrainDTO {

    /**
     * 商务座数量
     */
    private Integer businessClassQuantity;

    /**
     * 商务座候选标识
     */
    private Boolean businessClassCandidate;

    /**
     * 商务座价格
     */
    private Integer businessClassPrice;

    /**
     * 一等座数量
     */
    private Integer firstClassQuantity;

    /**
     * 一等座候选标识
     */
    private Boolean firstClassCandidate;

    /**
     * 一等座价格
     */
    private Integer firstClassPrice;

    /**
     * 二等座数量
     */
    private Integer secondClassQuantity;

    /**
     * 二等座候选标识
     */
    private Boolean secondClassCandidate;

    /**
     * 二等座价格
     */
    private Integer secondClassPrice;
}

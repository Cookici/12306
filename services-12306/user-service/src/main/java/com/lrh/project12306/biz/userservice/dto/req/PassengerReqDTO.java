package com.lrh.project12306.biz.userservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.req
 * @ClassName: PassengerReqDTO
 * @Author: 63283
 * @Description: 乘车人添加&修改请求参数
 * @Date: 2024/3/7 17:52
 */
@Data
public class PassengerReqDTO {
    /**
     * 乘车人id
     */
    private String id;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号码
     */
    private String idCard;

    /**
     * 优惠类型
     */
    private Integer discountType;

    /**
     * 手机号
     */
    private String phone;
}

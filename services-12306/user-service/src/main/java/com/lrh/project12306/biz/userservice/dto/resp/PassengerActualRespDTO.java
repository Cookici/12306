package com.lrh.project12306.biz.userservice.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.resp
 * @ClassName: PassengerActualRespDTO
 * @Author: 63283
 * @Description: 乘车人真实返回参数，不包含脱敏信息
 * @Date: 2024/3/7 17:54
 */
@Data
@Accessors(chain = true)
public class PassengerActualRespDTO {
    /**
     * 乘车人id
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

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

    /**
     * 添加日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createDate;

    /**
     * 审核状态
     */
    private Integer verifyStatus;
}

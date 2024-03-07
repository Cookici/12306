package com.lrh.project12306.biz.userservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.req
 * @ClassName: UserUpdateReqDTO
 * @Author: 63283
 * @Description: 用户修改请求参数
 * @Date: 2024/3/7 17:54
 */
@Data
public class UserUpdateReqDTO {
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 旅客类型
     */
    private Integer userType;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 地址
     */
    private String address;
}

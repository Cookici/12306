package com.lrh.project12306.biz.userservice.dto.resp;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.resp
 * @ClassName: UserRegisterRespDTO
 * @Author: 63283
 * @Description: 用户注册返回参数
 * @Date: 2024/3/7 17:54
 */
@Data
public class UserRegisterRespDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;
}

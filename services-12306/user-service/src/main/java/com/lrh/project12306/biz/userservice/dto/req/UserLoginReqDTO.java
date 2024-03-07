package com.lrh.project12306.biz.userservice.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.req
 * @ClassName: UserLoginReqDTO
 * @Author: 63283
 * @Description: 用户登录请求参数
 * @Date: 2024/3/7 17:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginReqDTO {
    /**
     * 用户名
     */
    private String usernameOrMailOrPhone;

    /**
     * 密码
     */
    private String password;
}

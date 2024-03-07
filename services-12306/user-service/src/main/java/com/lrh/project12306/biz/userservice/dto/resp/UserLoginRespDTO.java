package com.lrh.project12306.biz.userservice.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.resp
 * @ClassName: UserLoginRespDTO
 * @Author: 63283
 * @Description: 用户登录返回参数
 * @Date: 2024/3/7 17:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRespDTO {

    /**
     * 用户 ID
     */
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * Token
     */
    private String accessToken;
}

package com.lrh.project12306.biz.gatewayservice.toolkit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.gatewayservice.toolkit
 * @ClassName: UserInfoDTO
 * @Author: 63283
 * @Description: 用户信息实体
 * @Date: 2024/3/7 17:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO {

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
}

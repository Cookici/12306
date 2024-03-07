package com.lrh.project12306.biz.userservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.req
 * @ClassName: UserDeletionReqDTO
 * @Author: 63283
 * @Description: 用户注销请求参数
 * @Date: 2024/3/7 17:53
 */
@Data
public class UserDeletionReqDTO {
    /**
     * 用户名
     */
    private String username;
}

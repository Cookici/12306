package com.lrh.project12306.biz.userservice.service;

import com.lrh.project12306.biz.userservice.dto.req.UserDeletionReqDTO;
import com.lrh.project12306.biz.userservice.dto.req.UserLoginReqDTO;
import com.lrh.project12306.biz.userservice.dto.req.UserRegisterReqDTO;
import com.lrh.project12306.biz.userservice.dto.resp.UserLoginRespDTO;
import com.lrh.project12306.biz.userservice.dto.resp.UserRegisterRespDTO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户登录接口
 * @Date: 2024/3/7 18:06
 */

public interface UserLoginService {

    /**
     * 用户登录接口
     *
     * @param requestParam 用户登录入参
     * @return 用户登录返回结果
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 通过 Token 检查用户是否登录
     *
     * @param accessToken 用户登录 Token 凭证
     * @return 用户是否登录返回结果
     */
    UserLoginRespDTO checkLogin(String accessToken);

    /**
     * 用户退出登录
     *
     * @param accessToken 用户登录 Token 凭证
     */
    void logout(String accessToken);

    /**
     * 用户名是否存在
     *
     * @param username 用户名
     * @return 用户名是否存在返回结果
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     *
     * @param requestParam 用户注册入参
     * @return 用户注册返回结果
     */
    UserRegisterRespDTO register(UserRegisterReqDTO requestParam);

    /**
     * 注销用户
     *
     * @param requestParam 注销用户入参
     */
    void deletion(UserDeletionReqDTO requestParam);
}

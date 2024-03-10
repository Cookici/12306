package com.lrh.project12306.biz.userservice.service;

import com.lrh.project12306.biz.userservice.dto.req.UserUpdateReqDTO;
import com.lrh.project12306.biz.userservice.dto.resp.UserQueryActualRespDTO;
import com.lrh.project12306.biz.userservice.dto.resp.UserQueryRespDTO;

import jakarta.validation.constraints.NotEmpty;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户信息接口层
 * @Date: 2024/3/7 18:06
 */

public interface UserService {

    /**
     * 根据用户 ID 查询用户信息
     *
     * @param userId 用户 ID
     * @return 用户详细信息
     */
    UserQueryRespDTO queryUserByUserId(@NotEmpty String userId);

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户详细信息
     */
    UserQueryRespDTO queryUserByUsername(@NotEmpty String username);

    /**
     * 根据用户名查询用户无脱敏信息
     *
     * @param username 用户名
     * @return 用户详细信息
     */
    UserQueryActualRespDTO queryActualUserByUsername(@NotEmpty String username);

    /**
     * 根据证件类型和证件号查询注销次数
     *
     * @param idType 证件类型
     * @param idCard 证件号
     * @return 注销次数
     */
    Integer queryUserDeletionNum(Integer idType, String idCard);

    /**
     * 根据用户 ID 修改用户信息
     *
     * @param requestParam 用户信息入参
     */
    void update(UserUpdateReqDTO requestParam);
}

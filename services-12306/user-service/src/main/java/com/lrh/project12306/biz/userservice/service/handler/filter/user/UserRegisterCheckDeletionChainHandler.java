package com.lrh.project12306.biz.userservice.service.handler.filter.user;

import com.lrh.project12306.biz.userservice.dto.req.UserRegisterReqDTO;
import com.lrh.project12306.biz.userservice.service.UserService;
import com.lrh.project12306.framework.starter.convention.exception.ClientException;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service.handler.filter.user
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户注册检查证件号是否多次注销
 * @Date: 2024/3/7 18:06
 */

@Component
@RequiredArgsConstructor
public final class UserRegisterCheckDeletionChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    private final UserService userService;

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        Integer userDeletionNum = userService.queryUserDeletionNum(requestParam.getIdType(), requestParam.getIdCard());
        if (userDeletionNum >= 5) {
            throw new ClientException("证件号多次注销账号已被加入黑名单");
        }
    }

    @Override
    public int getOrder() {
        return 2;
    }
}

package com.lrh.project12306.biz.userservice.service.handler.filter.user;

import com.lrh.project12306.biz.userservice.common.enums.UserRegisterErrorCodeEnum;
import com.lrh.project12306.biz.userservice.dto.req.UserRegisterReqDTO;
import com.lrh.project12306.biz.userservice.service.UserLoginService;
import com.lrh.project12306.framework.starter.convention.exception.ClientException;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service.handler.filter.user
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户注册用户名唯一检验
 * @Date: 2024/3/7 18:06
 */

@Component
@RequiredArgsConstructor
public final class UserRegisterHasUsernameChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    private final UserLoginService userLoginService;

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        if (!userLoginService.hasUsername(requestParam.getUsername())) {
            throw new ClientException(UserRegisterErrorCodeEnum.HAS_USERNAME_NOTNULL);
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}

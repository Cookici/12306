package com.lrh.project12306.biz.userservice.service.handler.filter.user;

import java.util.Objects;

import com.lrh.project12306.biz.userservice.common.enums.UserRegisterErrorCodeEnum;
import com.lrh.project12306.biz.userservice.dto.req.UserRegisterReqDTO;
import com.lrh.project12306.framework.starter.convention.exception.ClientException;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service.handler.filter.user
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户注册参数必填检验
 * @Date: 2024/3/7 18:06
 */

@Component
public final class UserRegisterParamNotNullChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        if (Objects.isNull(requestParam.getUsername())) {
            throw new ClientException(UserRegisterErrorCodeEnum.USER_NAME_NOTNULL);
        } else if (Objects.isNull(requestParam.getPassword())) {
            throw new ClientException(UserRegisterErrorCodeEnum.PASSWORD_NOTNULL);
        } else if (Objects.isNull(requestParam.getPhone())) {
            throw new ClientException(UserRegisterErrorCodeEnum.PHONE_NOTNULL);
        } else if (Objects.isNull(requestParam.getIdType())) {
            throw new ClientException(UserRegisterErrorCodeEnum.ID_TYPE_NOTNULL);
        } else if (Objects.isNull(requestParam.getIdCard())) {
            throw new ClientException(UserRegisterErrorCodeEnum.ID_CARD_NOTNULL);
        } else if (Objects.isNull(requestParam.getMail())) {
            throw new ClientException(UserRegisterErrorCodeEnum.MAIL_NOTNULL);
        } else if (Objects.isNull(requestParam.getRealName())) {
            throw new ClientException(UserRegisterErrorCodeEnum.REAL_NAME_NOTNULL);
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

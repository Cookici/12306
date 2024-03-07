package com.lrh.project12306.biz.userservice.service.handler.filter.user;

import com.lrh.project12306.biz.userservice.common.enums.UserChainMarkEnum;
import com.lrh.project12306.biz.userservice.dto.req.UserRegisterReqDTO;
import com.lrh.project12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.service.handler.filter.user
 * @ClassName: asd123
 * @Author: 63283
 * @Description: 用户注册责任链过滤器
 * @Date: 2024/3/7 18:06
 */

public interface UserRegisterCreateChainFilter<T extends UserRegisterReqDTO> extends AbstractChainHandler<UserRegisterReqDTO> {

    @Override
    default String mark() {
        return UserChainMarkEnum.USER_REGISTER_FILTER.name();
    }
}

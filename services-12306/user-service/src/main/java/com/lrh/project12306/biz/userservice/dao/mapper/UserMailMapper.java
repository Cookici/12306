package com.lrh.project12306.biz.userservice.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lrh.project12306.biz.userservice.dao.entity.UserMailDO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dao.mapper
 * @ClassName: UserMailMapper
 * @Author: 63283
 * @Description: 用户邮箱表持久层
 * @Date: 2024/3/7 17:42
 */

public interface UserMailMapper extends BaseMapper<UserMailDO> {

    /**
     * 注销用户
     *
     * @param userMailDO 注销用户入参
     */
    void deletionUser(UserMailDO userMailDO);
}

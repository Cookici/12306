package com.lrh.project12306.biz.userservice.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lrh.project12306.biz.userservice.dao.entity.UserDO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dao.mapper
 * @ClassName: UserMapper
 * @Author: 63283
 * @Description: 用户信息持久层
 * @Date: 2024/3/7 18:01
 */

public interface UserMapper extends BaseMapper<UserDO> {
    /**
     * 注销用户
     *
     * @param userDO 注销用户入参
     */
    void deletionUser(UserDO userDO);
}

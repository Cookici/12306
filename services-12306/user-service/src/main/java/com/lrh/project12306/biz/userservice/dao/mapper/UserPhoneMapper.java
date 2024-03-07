package com.lrh.project12306.biz.userservice.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lrh.project12306.biz.userservice.dao.entity.UserPhoneDO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dao.mapper
 * @ClassName: UserPhoneMapper
 * @Author: 63283
 * @Description: 用户手机号持久层
 * @Date: 2024/3/7 17:43
 */

public interface UserPhoneMapper extends BaseMapper<UserPhoneDO> {
    /**
     * 注销用户
     *
     * @param userPhoneDO 注销用户入参
     */
    void deletionUser(UserPhoneDO userPhoneDO);
}

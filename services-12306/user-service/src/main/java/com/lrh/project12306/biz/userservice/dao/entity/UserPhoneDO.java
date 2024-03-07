package com.lrh.project12306.biz.userservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dao.entity
 * @ClassName: UserPhoneDO
 * @Author: 63283
 * @Description: 用户手机号实体对象
 * @Date: 2024/3/7 17:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_user_phone")
public class UserPhoneDO extends BaseDao {
    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}

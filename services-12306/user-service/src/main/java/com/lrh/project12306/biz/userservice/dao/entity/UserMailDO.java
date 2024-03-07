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
 * @ClassName: UserMailDao
 * @Author: 63283
 * @Description: 用户邮箱表实体对象
 * @Date: 2024/3/7 17:40
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_user_mail")
public class UserMailDO extends BaseDao {
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
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;
}

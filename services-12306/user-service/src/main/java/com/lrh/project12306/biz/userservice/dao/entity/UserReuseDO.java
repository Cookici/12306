package com.lrh.project12306.biz.userservice.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lrh.project12306.framework.starter.database.base.BaseDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dao.entity
 * @ClassName: UserReuseDO
 * @Author: 63283
 * @Description: 用户名复用表实体
 * @Date: 2024/3/7 17:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_reuse")
public class UserReuseDO extends BaseDao {

    /**
     * 用户名
     */
    private String username;
}

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
 * @ClassName: UserDeletionDO
 * @Author: 63283
 * @Description: 用户注销表实体
 * @Date: 2024/3/7 17:39
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user_deletion")
public class UserDeletionDO extends BaseDao {
    /**
     * id
     */
    private Long id;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号
     */
    private String idCard;
}

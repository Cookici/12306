package com.lrh.project12306.framework.starter.database.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.database.base
 * @ClassName: BaseDao
 * @Author: 63283
 * @Description: 数据持久层基础属性
 * @Date: 2024/3/6 20:36
 */

public class BaseDao {
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标志
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;
}

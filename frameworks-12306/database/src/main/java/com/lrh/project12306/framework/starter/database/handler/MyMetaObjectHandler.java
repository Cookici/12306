package com.lrh.project12306.framework.starter.database.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.lrh.project12306.framework.starter.common.enums.DelEnum;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.database.handler
 * @ClassName: MyMetaObjectHandler
 * @Author: 63283
 * @Description: 元数据处理器
 * @Date: 2024/3/6 20:37
 */

public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 数据新增时填充
     *
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "updateTime", Date.class, new Date());
        this.strictInsertFill(metaObject, "delFlag", Integer.class, DelEnum.NORMAL.code());
    }

    /**
     * 数据修改时填充
     *
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "updateTime", Date.class, new Date());
    }
}

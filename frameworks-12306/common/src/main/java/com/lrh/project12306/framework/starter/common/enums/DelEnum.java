package com.lrh.project12306.framework.starter.common.enums;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.common.enums
 * @ClassName: DelEnum
 * @Author: 63283
 * @Description: 删除标记枚举
 * @Date: 2024/3/6 16:46
 */

public enum DelEnum {
    /**
     * 正常状态
     */
    NORMAL(0),

    /**
     * 删除状态
     */
    DELETE(1);

    private final Integer statusCode;

    DelEnum(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer code() {
        return this.statusCode;
    }

    public String strCode() {
        return String.valueOf(this.statusCode);
    }

    @Override
    public String toString() {
        return strCode();
    }
}

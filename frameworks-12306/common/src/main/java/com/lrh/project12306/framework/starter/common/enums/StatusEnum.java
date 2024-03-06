package com.lrh.project12306.framework.starter.common.enums;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.common.enums
 * @ClassName: StatusEnum
 * @Author: 63283
 * @Description: 状态枚举
 * @Date: 2024/3/6 16:48
 */

public enum StatusEnum {

    /**
     * 成功
     */
    SUCCESS(0),

    /**
     * 失败
     */
    FAIL(1);

    private final Integer statusCode;

    StatusEnum(Integer statusCode) {
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

package com.lrh.project12306.framework.starter.common.enums;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.common.enums
 * @ClassName: FlagEnum
 * @Author: 63283
 * @Description: 标识枚举，非 Boolean.TRUE 即 Boolean.FALSE
 * @Date: 2024/3/6 16:47
 */

public enum FlagEnum {
    /**
     * FALSE
     */
    FALSE(0),

    /**
     * TRUE
     */
    TRUE(1);

    private final Integer flag;

    FlagEnum(Integer flag) {
        this.flag = flag;
    }

    public Integer code() {
        return this.flag;
    }

    public String strCode() {
        return String.valueOf(this.flag);
    }

    @Override
    public String toString() {
        return strCode();
    }
}

package com.lrh.project12306.framework.starter.convention.errorcode;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.errorcode
 * @ClassName: IErrorCode
 * @Author: 63283
 * @Description: 平台错误码
 * @Date: 2024/3/6 21:11
 */

public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}

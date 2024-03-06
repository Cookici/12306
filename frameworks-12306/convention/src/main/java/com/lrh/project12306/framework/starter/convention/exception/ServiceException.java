package com.lrh.project12306.framework.starter.convention.exception;

import com.lrh.project12306.framework.starter.convention.errorcode.BaseErrorCode;
import com.lrh.project12306.framework.starter.convention.errorcode.IErrorCode;

import java.util.Optional;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.exception
 * @ClassName: ServiceException
 * @Author: 63283
 * @Description: 服务端异常
 * @Date: 2024/3/6 21:09
 */

public class ServiceException extends AbstractException{
    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}

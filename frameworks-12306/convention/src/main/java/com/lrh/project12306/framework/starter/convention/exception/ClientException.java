package com.lrh.project12306.framework.starter.convention.exception;

import com.lrh.project12306.framework.starter.convention.errorcode.BaseErrorCode;
import com.lrh.project12306.framework.starter.convention.errorcode.IErrorCode;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.exception
 * @ClassName: ClientException
 * @Author: 63283
 * @Description: 客户端异常
 * @Date: 2024/3/6 21:14
 */

public class ClientException extends AbstractException{
    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}

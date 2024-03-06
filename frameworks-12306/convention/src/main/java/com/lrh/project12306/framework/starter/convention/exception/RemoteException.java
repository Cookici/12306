package com.lrh.project12306.framework.starter.convention.exception;

import com.lrh.project12306.framework.starter.convention.errorcode.BaseErrorCode;
import com.lrh.project12306.framework.starter.convention.errorcode.IErrorCode;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.exception
 * @ClassName: RemoteException
 * @Author: 63283
 * @Description: 远程服务调用异常
 * @Date: 2024/3/6 21:13
 */

public class RemoteException extends AbstractException{
    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}

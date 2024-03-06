package com.lrh.project12306.framework.starter.convention.exception;

import com.lrh.project12306.framework.starter.convention.errorcode.IErrorCode;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.exception
 * @ClassName: AbstractException
 * @Author: 63283
 * @Description:
 * @Date: 2024/3/6 21:10
 */

public abstract class AbstractException extends RuntimeException {

    public final String errorCode;

    public final String errorMessage;

    public AbstractException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable);
        this.errorCode = errorCode.code();
        this.errorMessage = Optional.ofNullable(StringUtils.hasLength(message) ? message : null).orElse(errorCode.message());
    }
}

package com.lrh.project12306.framework.starter.idempotent.core.token;

import com.lrh.project12306.framework.starter.idempotent.core.IdempotentExecuteHandler;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core.token
 * @ClassName: IdempotentTokenService
 * @Author: 63283
 * @Description: Token 实现幂等接口
 * @Date: 2024/3/7 11:05
 */

public interface IdempotentTokenService extends IdempotentExecuteHandler {

    /**
     * 创建幂等验证Token
     */
    String createToken();
}

package com.lrh.project12306.framework.starter.idempotent.core.token;

import com.lrh.project12306.framework.starter.convention.result.Result;
import com.lrh.project12306.framework.starter.web.Results;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.idempotent.core.token
 * @ClassName: IdempotentTokenController
 * @Author: 63283
 * @Description: 基于 Token 验证请求幂等性控制器
 * @Date: 2024/3/7 11:08
 */
@RestController
@RequiredArgsConstructor
public class IdempotentTokenController {
    private final IdempotentTokenService idempotentTokenService;

    /**
     * 请求申请Token
     */
    @GetMapping("/token")
    public Result<String> createToken() {
        return Results.success(idempotentTokenService.createToken());
    }
}

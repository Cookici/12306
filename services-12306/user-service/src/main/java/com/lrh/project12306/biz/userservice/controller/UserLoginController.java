package com.lrh.project12306.biz.userservice.controller;

import com.lrh.project12306.biz.userservice.dto.req.UserLoginReqDTO;
import com.lrh.project12306.biz.userservice.dto.resp.UserLoginRespDTO;
import com.lrh.project12306.biz.userservice.service.UserLoginService;
import com.lrh.project12306.framework.starter.convention.result.Result;
import com.lrh.project12306.framework.starter.web.Results;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.controller
 * @ClassName: UserLoginController
 * @Author: 63283
 * @Description: 用户登录控制层
 * @Date: 2024/3/7 17:51
 */
@RestController
@RequiredArgsConstructor
public class UserLoginController {
    private final UserLoginService userLoginService;

    /**
     * 用户登录
     */
    @PostMapping("/api/user-service/v1/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userLoginService.login(requestParam));
    }

    /**
     * 通过 Token 检查用户是否登录
     */
    @GetMapping("/api/user-service/check-login")
    public Result<UserLoginRespDTO> checkLogin(@RequestParam("accessToken") String accessToken) {
        UserLoginRespDTO result = userLoginService.checkLogin(accessToken);
        return Results.success(result);
    }

    /**
     * 用户退出登录
     */
    @GetMapping("/api/user-service/logout")
    public Result<Void> logout(@RequestParam(required = false) String accessToken) {
        userLoginService.logout(accessToken);
        return Results.success();
    }
}

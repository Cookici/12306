package com.lrh.project12306.biz.orderservice.remote;

import com.lrh.project12306.biz.orderservice.remote.dto.UserQueryActualRespDTO;
import com.lrh.project12306.framework.starter.convention.result.Result;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.orderservice.remote
 * @ClassName: UserRemoteService
 * @Author: 63283
 * @Description: 用户远程服务调用
 * @Date: 2024/3/11 11:46
 */
@FeignClient(value = "index12306-user${unique-name:}-service", url = "${aggregation.remote-url:}")
public interface UserRemoteService {
    /**
     * 根据乘车人 ID 集合查询乘车人列表
     */
    @GetMapping("/api/user-service/actual/query")
    Result<UserQueryActualRespDTO> queryActualUserByUsername(@RequestParam("username") @NotEmpty String username);
}

package com.lrh.project12306.biz.ticketservice.remote;

import com.lrh.project12306.biz.ticketservice.remote.dto.PassengerRespDTO;
import com.lrh.project12306.framework.starter.convention.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.remote
 * @ClassName: UserRemoteService
 * @Author: 63283
 * @Description: 用户远程服务调用
 * @Date: 2024/3/7 22:52
 */
@FeignClient(value = "index12306-user${unique-name:}-service", url = "${aggregation.remote-url:}")
public interface UserRemoteService {
    /**
     * 根据乘车人 ID 集合查询乘车人列表
     */
    @GetMapping("/api/user-service/inner/passenger/actual/query/ids")
    Result<List<PassengerRespDTO>> listPassengerQueryByIds(@RequestParam("username") String username, @RequestParam("ids") List<String> ids);
}

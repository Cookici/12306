package com.lrh.project12306.biz.ticketservice.remote;

import com.lrh.project12306.biz.ticketservice.remote.dto.PayInfoRespDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.RefundReqDTO;
import com.lrh.project12306.biz.ticketservice.remote.dto.RefundRespDTO;
import com.lrh.project12306.framework.starter.convention.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.remote
 * @ClassName: PayRemoteService
 * @Author: 63283
 * @Description: 支付单远程调用服务
 * @Date: 2024/3/7 22:49
 */
@FeignClient(value = "index12306-pay${unique-name:}-service", url = "${aggregation.remote-url:}")
public interface PayRemoteService {
    /**
     * 支付单详情查询
     */
    @GetMapping("/api/pay-service/pay/query")
    Result<PayInfoRespDTO> getPayInfo(@RequestParam(value = "orderSn") String orderSn);

    /**
     * 公共退款接口
     */
    @PostMapping("/api/pay-service/common/refund")
    Result<RefundRespDTO> commonRefund(@RequestBody RefundReqDTO requestParam);
}

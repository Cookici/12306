package com.lrh.project12306.biz.payservice.controller;

import com.lrh.project12306.biz.payservice.dto.RefundReqDTO;
import com.lrh.project12306.biz.payservice.dto.RefundRespDTO;
import com.lrh.project12306.biz.payservice.service.RefundService;
import com.lrh.project12306.framework.starter.convention.result.Result;
import com.lrh.project12306.framework.starter.web.Results;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.controller
 * @ClassName: RefundController
 * @Author: 63283
 * @Description: 退款控制层
 * @Date: 2024/3/11 12:25
 */
@RestController
@RequiredArgsConstructor
public class RefundController {

    private final RefundService refundService;

    /**
     * 公共退款接口
     */
    @PostMapping("/api/pay-service/common/refund")
    public Result<RefundRespDTO> commonRefund(@RequestBody RefundReqDTO requestParam) {
        return Results.success(refundService.commonRefund(requestParam));
    }
}

package com.lrh.project12306.biz.payservice.service;

import com.lrh.project12306.biz.payservice.dto.RefundReqDTO;
import com.lrh.project12306.biz.payservice.dto.RefundRespDTO;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.payservice.service
 * @ClassName: RefundService
 * @Author: 63283
 * @Description: 退款接口层
 * @Date: 2024/3/11 13:57
 */

public interface RefundService {

    /**
     * 公共退款接口
     *
     * @param requestParam 退款请求参数
     * @return 退款返回详情
     */
    RefundRespDTO commonRefund(RefundReqDTO requestParam);
}

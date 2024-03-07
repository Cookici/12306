package com.lrh.project12306.biz.userservice.dto.req;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.userservice.dto.req
 * @ClassName: PassengerRemoveReqDTO
 * @Author: 63283
 * @Description: 乘车人移除请求参数
 * @Date: 2024/3/7 17:52
 */
@Data
public class PassengerRemoveReqDTO {
    /**
     * 乘车人id
     */
    private String id;
}

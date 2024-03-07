package com.lrh.project12306.framework.starter.log.core;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.log.core
 * @ClassName: ILogPrintDTO
 * @Author: 63283
 * @Description: ILog 日志打印实体
 * @Date: 2024/3/6 21:48
 */
@Data
public class ILogPrintDTO {

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 请求入参
     */
    private Object[] inputParams;

    /**
     * 返回参数
     */
    private Object outputParams;
}

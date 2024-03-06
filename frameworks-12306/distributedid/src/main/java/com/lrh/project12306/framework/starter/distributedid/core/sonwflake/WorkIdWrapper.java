package com.lrh.project12306.framework.starter.distributedid.core.sonwflake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.distributedid.sonwflake
 * @ClassName: WorkIdWrapper
 * @Author: 63283
 * @Description: WorkId 包装器
 * @Date: 2024/3/6 20:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkIdWrapper {

    /**
     * 工作ID
     */
    private Long workId;

    /**
     * 数据中心ID
     */
    private Long dataCenterId;
}

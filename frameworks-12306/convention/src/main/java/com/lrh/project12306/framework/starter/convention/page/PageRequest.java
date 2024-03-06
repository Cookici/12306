package com.lrh.project12306.framework.starter.convention.page;

import lombok.Data;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.page
 * @ClassName: PageRequest
 * @Author: 63283
 * @Description: 分页请求对象
 * PageRequest、PageResponse 可以理解是防腐层的一种实现，不论底层 ORM 框架，对外分页参数属性不变
 * @Date: 2024/3/6 21:15
 */

@Data
public class PageRequest {

    /**
     * 当前页
     */
    private Long current = 1L;

    /**
     * 每页显示条数
     */
    private Long size = 10L;
}


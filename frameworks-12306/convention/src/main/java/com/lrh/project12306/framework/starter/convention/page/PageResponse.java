package com.lrh.project12306.framework.starter.convention.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.convention.page
 * @ClassName: PageResponse
 * @Author: 63283
 * @Description: 分页返回对象
 * PageRequest、PageResponse 可以理解是防腐层的一种实现，不论底层 ORM 框架，对外分页参数属性不变
 * @Date: 2024/3/6 21:15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse <T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private Long current;

    /**
     * 每页显示条数
     */
    private Long size = 10L;

    /**
     * 总数
     */
    private Long total;

    /**
     * 查询数据列表
     */
    private List<T> records = Collections.emptyList();

    public PageResponse(long current, long size) {
        this(current, size, 0);
    }

    public PageResponse(long current, long size, long total) {
        if (current > 1) {
            this.current = current;
        }
        this.size = size;
        this.total = total;
    }

    public PageResponse setRecords(List<T> records) {
        this.records = records;
        return this;
    }

    public <R> PageResponse<R> convert(Function<? super T, ? extends R> mapper) {
        List<R> collect = this.getRecords().stream().map(mapper).collect(Collectors.toList());
        return ((PageResponse<R>) this).setRecords(collect);
    }
}
package com.lrh.project12306.framework.starter.designpattern.builder;

import java.io.Serializable;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.designpattern.builder
 * @ClassName: Builder
 * @Author: 63283
 * @Description: Builder 模式抽象接口
 * @Date: 2024/3/6 16:51
 */

public interface Builder<T> extends Serializable {
    T build();
}

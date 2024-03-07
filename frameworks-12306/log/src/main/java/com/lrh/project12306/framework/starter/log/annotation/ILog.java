package com.lrh.project12306.framework.starter.log.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.framework.starter.log.annotation
 * @ClassName: ILog
 * @Author: 63283
 * @Description: Log 注解打印，可以标记在类或者方法上 标记在类上，类下所有方法都会打印；标记在方法上，仅打印标记方法；
 * 如果类或者方法上都有标记，以方法上注解为准
 * @Date: 2024/3/6 21:47
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ILog {

    /**
     * 入参打印
     *
     * @return 打印结果中是否包含入参，{@link Boolean#TRUE} 打印，{@link Boolean#FALSE} 不打印
     */
    boolean input() default true;

    /**
     * 出参打印
     *
     * @return 打印结果中是否包含出参，{@link Boolean#TRUE} 打印，{@link Boolean#FALSE} 不打印
     */
    boolean output() default true;
}

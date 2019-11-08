package com.jd.ascpect.common.annotation;

import java.lang.annotation.*;

/**
 * 在方法上标记操作备注，以及操作类型，用于记录用户操作日志描述
 * @author xuzhangwang
 * @date 2019/11/8 16:35
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JMethod {

    /* 功能模块 */
    String module() default "";

    /*  操作备注 */
    String remark();

    /* 操作类型 */
    String operateType() default "";
}

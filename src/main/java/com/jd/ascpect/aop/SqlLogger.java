package com.jd.ascpect.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xuzhangwang
 * @date 2019/11/8 16:40
 */
@Aspect
@Component
@Slf4j
public class SqlLogger {

    @Pointcut("@annotation(com.jd.ascpect.common.annotation.JMethod)")
    public void sql() {}

    @Before("sql()")
    public void doSql() {
        log.info("执行sql");
    }


}

package com.jd.ascpect.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 * @author xuzhangwang
 * @date 2019/11/14 11:13
 */
@Slf4j
@Aspect
@Component
public class ControllerAscpect {


    @Pointcut("execution(* com.jd.ascpect.controller.SiteController.edit(..))")
    public void verify() {}

    @Around("verify()")
    public Object doVerify(ProceedingJoinPoint point) {
        Object result = null;
        Object[] args = point.getArgs();
        Integer id = (Integer) args[0];
        Model model = (Model) args[1];
        log.info("id: {}, model: {}", id, model);
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            log.info("model: {}", model);
            return result;
        }
    }

}

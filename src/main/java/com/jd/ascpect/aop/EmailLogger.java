package com.jd.ascpect.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xuzhangwang
 * @date 2019/11/7 19:42
 */
@Aspect
@Slf4j
@Component
public class EmailLogger {

    // 定义切点
    @Pointcut("execution(public * com.jd.ascpect.service.SendEmailService.*(..))")
    public void verify() {}

//    @Before("verify()")
    public void doVerify() {
        log.info("before send email must write log info");
    }

//    @Before("verify()")
    public void beforeSendEmail(JoinPoint point) {
        log.info("目标方法名: {}",point.getSignature().getName());
        log.info("目标方法所属类名: {}", point.getSignature().getDeclaringType());
        log.info("目标方法所属类名: {}", point.getSignature().getDeclaringTypeName());
        log.info("目标方法声明类型: {}", point.getSignature().getModifiers());
        Object[] args = point.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("第 (i + 1) 个参数");
        }
        System.out.println("被代理的对象:" + point.getTarget());
        System.out.println("代理对象自己:" + point.getThis());
    }


    /**
     * 使用aop机制来拦截方法，记录日志, 执行方法, 执行时间之类
     * @param point
     * @return
     */
    @Around("verify()")
    public Object aroundSendEmail(ProceedingJoinPoint point) {
        Object result = null;
        StringBuilder sb = new StringBuilder();
        long start = 0;
        try {
            // 记录线程id, 方法签名
            sb.append("thread: " + Thread.currentThread().getName());
            // 记录参数
            Signature signature = point.getSignature();
            System.out.println(signature.getName());
            System.out.println(signature.getDeclaringTypeName());
            System.out.println(signature.getDeclaringType());
            System.out.println(point.getTarget());
            System.out.println("1" + JSON.toJSONString(point.getTarget()));
            if (point.getArgs() != null) {
                sb.append(" args:");
                for (int i = 0; i < point.getArgs().length; i++) {
                    sb.append("[" + i + "]" + point.getArgs()[i] + ", ");
                }
            }
            start = System.currentTimeMillis();
            result = point.proceed();
        } catch (Throwable throwable) {
            sb.append(", error: " + throwable.getMessage());
            throw throwable;
        } finally {
            long spendTime = System.currentTimeMillis() - start;
            // 记录执行时间
            sb.append("spendTime: " + spendTime + " ms");
            log.info(sb.toString());
            return result;
        }
    }
}

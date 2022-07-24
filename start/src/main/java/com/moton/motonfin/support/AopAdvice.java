package com.moton.motonfin.support;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author daiweihang
 * @date 2022/7/17
 */
@Aspect
@Component
public class AopAdvice {
    @Pointcut("execution (* com.moton.motonfin.service.*.*(..))")
    public void aopPointcut() {

    }

    @Before("aopPointcut()")
    public void beforeAdvice() {
        System.out.println("---------------beforeAdvice...");
    }

    @After("aopPointcut()")
    public void afterAdvice() {
        System.out.println("afterAdvice...");
    }

    @Around("aopPointcut()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        System.out.println("after");
    }


}

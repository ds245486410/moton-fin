package com.moton.motonfin;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author daiweihang
 * @date 2022/7/12
 */
//@Aspect
//@Component
public class AopAdvice {
    @Pointcut("execution (* com.moton.motonfin.*.*(..))")
    public void test() {

    }

    @Before("test()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice...");
    }


}

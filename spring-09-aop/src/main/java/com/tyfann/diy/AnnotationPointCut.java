package com.tyfann.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author tyfann
 * @date 2021/3/29 7:46 下午
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.tyfann.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=======方法执行前========");
    }

    @After("execution(* com.tyfann.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=======方法执行后========");
    }

    @Around("execution(* com.tyfann.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("==环绕前==");
        point.proceed();
        System.out.println("==环绕后==");

    }
}

package com.springtest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Маша on 20.10.2017.
 */
@Component
@Aspect
public class MyAspectAround {
    @Pointcut("execution(* com.springtest.Car.driverInfo(..))")
    public void aspectdriverInfo(){}

    @Around("aspectdriverInfo()")
    public void aspectAround(ProceedingJoinPoint joinPoint){
        System.out.println("Hi");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Bay");
    }
}

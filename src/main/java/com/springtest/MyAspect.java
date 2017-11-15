package com.springtest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Маша on 20.10.2017.
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.springtest.Car.go(..))")
    public void aspectGo(){}

    @Before("aspectGo()")
    public void Start (){
        System.out.println("Start driver");
    }
    @After("aspectGo()")
    public void Finish(){
        System.out.println("Finish driver");
    }
}

package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Маша on 20.10.2017.
 */
public class Run {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Car car = (Car)ctx.getBean("mersedescar");
        car.go();
        car.driverInfo();

    }
}

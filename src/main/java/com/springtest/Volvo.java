package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Маша on 20.10.2017.
 */
public class Volvo implements Car {
    private String color;
    private int wheel;
    private int motor;
    @Autowired
    @Qualifier("SashaDriverVolvo")
    private Driver driver;



    public Volvo(String color, int wheel, int motor) {
        this.color = color;
        this.wheel = wheel;
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void go() {
        System.out.println("Car Volvo have color: " + color);
        System.out.println("Car Volvo have wheel: " + wheel);
        System.out.println("Car Volvo have motor: " + motor);
    }

    public void driverInfo() {
        driver.dataDriver();
    }
}

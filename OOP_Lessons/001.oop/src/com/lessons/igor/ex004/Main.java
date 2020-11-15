package com.lessons.igor.ex004;

import com.lessons.igor.ex001.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setMaxSpeed(300);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);
        car2.setMaxSpeed(250);
        System.out.println(car2.getMaxSpeed());
    }
}

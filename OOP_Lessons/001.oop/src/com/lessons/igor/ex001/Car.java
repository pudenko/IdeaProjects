package com.lessons.igor.ex001;

public class Car {
    private String model;
    private int maxSpeed;
    private int speed;
    private int year;

    public Car() {}

    public Car(String model, int maxSpeed, int speed, int year) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

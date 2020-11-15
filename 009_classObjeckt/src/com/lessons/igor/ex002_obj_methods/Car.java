package com.lessons.igor.ex002_obj_methods;

public class Car {
    private int speed;
    private String color;

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Speed is: %s\nColor is: %s", speed, color);
    }
}

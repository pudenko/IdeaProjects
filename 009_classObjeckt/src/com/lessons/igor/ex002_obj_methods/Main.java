package com.lessons.igor.ex002_obj_methods;

public class Main {
    public static void main(String[] args) {
        Car test = new Car(30, "red");
        System.out.println(test.getClass().getSimpleName());
        System.out.println(test);
    }
}

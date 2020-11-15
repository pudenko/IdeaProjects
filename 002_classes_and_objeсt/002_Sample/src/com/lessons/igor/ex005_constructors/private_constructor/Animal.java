package com.lessons.igor.ex005_constructors.private_constructor;

public class Animal {
    private int age;

    private Animal(int age) {
        this.age = age;
    }
    public static void testMethod(){
        new Animal(5);
    }
}

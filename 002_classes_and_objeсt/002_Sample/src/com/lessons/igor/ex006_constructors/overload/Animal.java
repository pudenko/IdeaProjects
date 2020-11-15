package com.lessons.igor.ex006_constructors.overload;

public class Animal {
    private int age;
    private int height;

    public Animal() {
        age = 2;
        height = 5;
    }

    public Animal(int age) {
        this.age = age;
        height = 8;
    }

    public Animal(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age){
        this.age = age;
    }
}

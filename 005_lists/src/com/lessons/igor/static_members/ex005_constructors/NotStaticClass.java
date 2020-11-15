package com.lessons.igor.static_members.ex005_constructors;

public class NotStaticClass {
    public NotStaticClass() {
        System.out.println("Construktor");
    }

    static {
        System.out.println("Static block");
    }

    public static void test() {
        System.out.println("Statik method");
    }

    public void test1() {
        System.out.println("Not static method");
    }
}

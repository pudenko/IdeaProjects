package com.lessons.igor.interfaces.ex002;

public class Derived implements One, Two{
    @Override
    public void test1() {
        System.out.println("test1");
    }

    @Override
    public void test2() {
        System.out.println("test2");
    }
}

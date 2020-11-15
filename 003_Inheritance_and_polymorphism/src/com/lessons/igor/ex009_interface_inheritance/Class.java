package com.lessons.igor.ex009_interface_inheritance;

public class Class implements One, Two, Three{

    @Override
    public void testOne() {
        System.out.println("testOne");
    }

    @Override
    public void testThree() {
        System.out.println("testThree");
    }

    @Override
    public void testTwo() {
        System.out.println("testTwo");
    }
}

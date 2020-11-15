package com.lessons.igor.interfaces.ex002;

public class Main {
    public static void main(String[] args) {
        One one = new Derived();
        Two two = new Derived();
        one.test1();
        two.test2();
    }
}

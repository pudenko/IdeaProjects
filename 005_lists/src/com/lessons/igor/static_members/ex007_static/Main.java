package com.lessons.igor.static_members.ex007_static;

abstract class Base {
    public static void test1() {
        System.out.println("test1");
    }
}

class Derived extends Base {
    public static void test1() {
        System.out.println("test2");
    }
}

public class Main {
    public static void main(String[] args) {
        Derived.test1();
        Base.test1();
    }
}

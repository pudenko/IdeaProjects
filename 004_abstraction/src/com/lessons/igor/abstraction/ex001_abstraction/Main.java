package com.lessons.igor.abstraction.ex001_abstraction;

abstract class TestClass {
    public abstract void test();
}

class Konkter extends TestClass {
    public void test() {
        System.out.println("Hi");
    }
}

public class Main {
    public static void main(String[] args) {
        Konkter kon = new Konkter();
        kon.test();
    }
}

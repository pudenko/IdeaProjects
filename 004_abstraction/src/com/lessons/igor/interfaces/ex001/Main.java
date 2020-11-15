package com.lessons.igor.interfaces.ex001;

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        my.test();
    }
}

class MyClass implements Test {
    @Override
    public void test() {
        System.out.println("Реал.интерф.");
    }
}

interface Test {
    void test();
}
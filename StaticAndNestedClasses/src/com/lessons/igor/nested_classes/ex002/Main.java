package com.lessons.igor.nested_classes.ex002;

public class Main {
    public static void main(String[] args) {
        MyClass.Nested1 nested1 = new MyClass(7).new Nested1();
        nested1.test(5);
        MyClass.Nested2 nested2 = new MyClass(7).new Nested2();
        nested2.test(5);//6
        nested1.test(5);//5
    }
}

class MyClass {
    private static int my = 0;

    public MyClass(int x) {
        my = x;
    }

    class Nested1 {
        public void test(int a) {
            my = a;
            System.out.println(my);
        }
    }
    class Nested2 {
        public void test(int a) {
            my += a;
            System.out.println(my);
        }
    }
}
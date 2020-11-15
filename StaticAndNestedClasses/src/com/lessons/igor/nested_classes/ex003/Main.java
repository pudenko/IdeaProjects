package com.lessons.igor.nested_classes.ex003;

class MyClass {
    private int test = 0;

    public class Nested1 {
        MyClass ii = new MyClass();

        public void my(int a) {
            ii.test = a;
            System.out.println(ii.test);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested1 you = new MyClass().new Nested1();
        you.my(5);
    }
}


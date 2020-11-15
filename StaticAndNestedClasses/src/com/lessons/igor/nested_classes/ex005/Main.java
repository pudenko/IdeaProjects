package com.lessons.igor.nested_classes.ex005;

class MyClass extends Base {
    public class Nested1 {
        public void test2() {
            System.out.println("test2 Nested1");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();
        MyClass.Nested1 nest = new MyClass().new Nested1();
        my.test1();
        nest.test2();

    }
}

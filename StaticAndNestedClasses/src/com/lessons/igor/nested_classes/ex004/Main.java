package com.lessons.igor.nested_classes.ex004;

class MyClass {
    public class Nested1 extends Base {
        public void test1() {
            System.out.println("test1 Nested1");
        }
    }

    public class Nested2 extends Base {
        @Override
        public void test() {
            System.out.println("test Nested2");
        }

        public void test1() {
            System.out.println("test1 Nested2");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested1 my = new MyClass().new Nested1();
        my.test();
        my.test1();

        MyClass.Nested2 my2 = new MyClass().new Nested2();
        my2.test();
        my2.test1();
    }
}

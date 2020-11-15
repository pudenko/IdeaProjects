package com.lessons.igor.anonymus.ex001;

interface Interface {
    void test();

    void test1();

    void test2();
}

public class Main {
    public static void main(String[] args) {
        Interface test1 = new Interface() {
            @Override
            public void test() {
                System.out.println("1");
            }

            @Override
            public void test1() {
                System.out.println("2");
            }

            @Override
            public void test2() {
                System.out.println("3");
            }
        };
        test1.test();
        test1.test2();


    }
}

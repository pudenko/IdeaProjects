package com.lessons.igor.anonymus.ex002;

interface Test {
    void test1();
}

public class Main {
    public static void main(String[] args) {
        Test ratatui = new Test() {
            public double d = 4.4;
            protected String str = "str";
            private int num = 10;
            @Override
            public void test1() {
                num = 1234;
                System.out.printf("double = %.2f ,str = %s , num = %d ", d,str,num);
            }
        };
        ratatui.test1();
    }
}

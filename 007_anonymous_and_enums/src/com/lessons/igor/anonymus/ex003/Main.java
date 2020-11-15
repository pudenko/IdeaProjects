package com.lessons.igor.anonymus.ex003;

interface Test {
    void test1();

    void test2();

    void test3();
}

public class Main {
    public static void main(String[] args) {
        Test pudenko = new Test() {
            public int inter = 5;

            @Override
            public void test1() {
                inter = 3;
                System.out.println("inter = " + getInter());
            }

            @Override
            public void test2() {
                setInter(7);

                int inter = 3;
                inter = 4;

                System.out.println("inter = " + getInter());
            }

            public int getInter() {
                return inter;
            }

            public void setInter(int inter) {
                this.inter = inter;
            }

            @Override
            public void test3() {
                System.out.println("inter = " + getInter());
            }
        };

        pudenko.test1();
//        pudenko.test2();
        pudenko.test3();

    }
}

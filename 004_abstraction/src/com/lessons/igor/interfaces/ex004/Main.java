package com.lessons.igor.interfaces.ex004;

class Test implements inter1, inter2 {
    @Override
    public void intermet1_1() {
        System.out.println("Я intermet1_1");
    }

    @Override
    public void intermet2_1() {
        System.out.println("Я intermet2_1");
    }
}

interface inter1 {
    void intermet1_1();
}

interface inter2 extends inter1 {
    void intermet2_1();
}

public class Main {
    public static void main(String[] args) {
        Test my = new Test();
        my.intermet1_1();
        my.intermet2_1();

        inter1 myin1 = my;
        myin1.intermet1_1();

        inter2 myin2 = my;
        myin2.intermet1_1();
        myin2.intermet2_1();
    }
}

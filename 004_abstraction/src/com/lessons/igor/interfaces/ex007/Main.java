package com.lessons.igor.interfaces.ex007;


class Test extends Abstr {
    @Override
    public void met() {
        System.out.println("Ту-ту-ту...");
    }
}

interface Int {
    void met();
}

abstract class Abstr implements Int {
    //    @Override
//    public void met() {
//        System.out.println("Тра-та-та...");
//    }
    abstract public void met();
}

public class Main {
    public static void main(String[] args) {
        Test my = new Test();
        my.met();

        Int in1 = my;
        my.met();

        Abstr abs = my;
        my.met();
    }
}


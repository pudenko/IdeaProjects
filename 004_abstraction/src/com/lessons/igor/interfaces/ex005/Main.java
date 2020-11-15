package com.lessons.igor.interfaces.ex005;

class Test implements Int1, Int2 {
    @Override
    public void met1() {
        System.out.println("Реализацю первого и второго интерф.");
    }
}

interface Int1 {
    void met1();
}

interface Int2 {
    void met1();
}

public class Main {
    public static void main(String[] args) {
        Test my = new Test();
        my.met1();

        Int1 in1 = my;
        in1.met1();

        Int2 int2 = my;
        int2.met1();
    }
}

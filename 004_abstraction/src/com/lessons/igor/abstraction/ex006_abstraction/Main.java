package com.lessons.igor.abstraction.ex006_abstraction;

abstract class Test {
    Test() {
        System.out.println("1 and Test");
        this.abstractMethod();
        System.out.println("2 and Test");
    }

    public abstract void abstractMethod();

};

class Test2 extends Test {
    String s = "first";

    Test2() {

        System.out.println("3 and Test2");
        s = "second";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Реализ.метод.Test2" + s);
    }
};

public class Main {
    public static void main(String[] args) {
        Test test = new Test2();
        System.out.println("-----------");
        test.abstractMethod();
        //-----------
        //3 and Test2
        //Реализ.метод.Test2second

        //
        //1 and Test
        //Релиз.метод.Test2 + First
        //2 and Test
        //3 and Test
        //-------
        //Релиз.метод.Test2 + Second
    }
}

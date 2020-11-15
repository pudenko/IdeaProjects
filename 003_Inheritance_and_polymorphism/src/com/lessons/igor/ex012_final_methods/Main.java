package com.lessons.igor.ex012_final_methods;

class ClassA {
    public void method1() {
        System.out.println("ClassA.method1");
    }

    public void method2() {
        System.out.println("ClassA.method2");
    }

    static void method3() {
    }
}

class ClassB extends ClassA {
    @Override
    public final void method1() {
        System.out.println("ClassB.method1");
    }

    @Override
    public void method2() {
        System.out.println("ClassB.method2");
    }
//    @Override
//    static void method3(){}
}

class ClassC extends ClassB {
    // Попытка переопределить method1 приводит к ошибке компилятора.
    // @Override
    // public void method1() { System.out.println("ClassC.method1"); }

    // Переопределение method2 позволено.
    @Override
    public final void method2() {
        System.out.println("ClassC.method2");
    }
}

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.method1();
        a.method2();
//        ClassA.method3();
        System.out.println("-------------------");

        ClassB b = new ClassB();
        b.method1();
        b.method2();
        System.out.println("-------------------");

        ClassC c = new ClassC();
        c.method1();
        c.method2();
    }
}

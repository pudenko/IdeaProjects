package com.lessons.igor.ex009;

interface One {
}

interface Two<U> extends One {
}

class Derived implements One, Two<String> {
}

class Derived2 implements Two<Double> {
}

class Derived3 implements Two<Object> {
}

class MyClass<T extends One> {
}

class MyClass2<T extends Two<String>> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<Two<String>> test = new MyClass<>();
        MyClass<Two<Integer>> test1 = new MyClass<>();
//        MyClass2<Two<Integer>> test2 = new MyClass2<Two<Integer>>(); // так не получится
        MyClass2<Two<String>> test2 = new MyClass2<>();
        Two<String> test3 = new Derived();
        Two<Double> test4 = new Derived2();
        One uuu;
        Two<String> ooo;
//        Two<String> test5 = new Derived3();
//        Two<Double> test6 = new Derived3();

    }
}

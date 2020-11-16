package com.lessons.igor.ex008;

interface One {
}

interface Two<U> {
}

class Derived implements One, Two<Object> {
}
//<T extends One> и <T extends Two<Object>> аргумент типа должен являтся или реализов. указаный интерфейс.
//ограничивающий интерфейс так же может быть универсальным.
class MyClass<T extends One> {
}

class MyClass2<T extends Two<Object>> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<One> test1 = new MyClass<>();
        MyClass<Derived> test2 = new MyClass<>();
        MyClass2<Two<Object>> test3 = new MyClass2<>();
        MyClass2<Derived> test4 = new MyClass2<>();

    }
}

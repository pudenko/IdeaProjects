package com.lessons.igor.ex001;

class MyClass<T> {
    public T field;

    public void test() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<String> test1 = new MyClass<>();
        test1.field = "tet";
        test1.test();
    }
}

package com.lessons.igor.static_members.ex001_static;

public class Main {
    public static void main(String[] args) {
        NotStaticClass instance1 = new NotStaticClass(6);
        NotStaticClass instance2 = new NotStaticClass(64);
        instance1.test();
        instance2.test();
        NotStaticClass.field = 1;

        instance1.test();
        instance2.test();
    }
}

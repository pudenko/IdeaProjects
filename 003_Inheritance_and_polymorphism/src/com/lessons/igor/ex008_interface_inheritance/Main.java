package com.lessons.igor.ex008_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.test();
        System.out.println(someClass.publicField);
        SomeInterface someInterface1 = someClass;
        SomeClass downSome = (SomeClass) (someInterface1);
        System.out.println(downSome.publicField);
        downSome.test();
    }
}

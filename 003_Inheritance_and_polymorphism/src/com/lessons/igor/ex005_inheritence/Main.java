package com.lessons.igor.ex005_inheritence;

public class Main {
    public static void main(String[] args) {
        Derived der = new Derived();
        der.field1 = 1;
        der.field2 = 2;
        der.field3 = 3;
        der.field4 = 4;
        der.field5 = 5;
        Base der1 = (Base)(der);
        System.out.println(der.field1);

        der1.field1 = 10;
        System.out.println(der.field1);
    }
}

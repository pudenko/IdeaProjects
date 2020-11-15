package com.lessons.igor.interfaces.ex003;

import com.sun.jdi.InterfaceType;

public class Main {
    public static void main(String[] args) {
        Derived der = new Derived();
        der.one();
        der.two();
        der.zero();
        System.out.println("------");

        Base base;
        base = der;
        base.zero();

        One on = der;
        on.one();

        Two tw = der;
        tw.two();
    }
}

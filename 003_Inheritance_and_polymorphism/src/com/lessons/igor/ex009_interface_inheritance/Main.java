package com.lessons.igor.ex009_interface_inheritance;

import com.sun.jdi.InterfaceType;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class();
        clas.testOne();
        One clas1 = clas;
        clas1.testOne();
        Two clas2 = clas;
        clas2.testTwo();
        Three clas3 = clas;
        clas3.testThree();
    }
}

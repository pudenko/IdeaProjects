package com.lessons.igor.interfaces.ex008;


class Base {
    public void met() {
        System.out.println("Я из Base");
    }
}

interface Int {
    void met();
}

class Derived extends Base implements Int {

}

public class Main {
    public static void main(String[] args) {
        Derived der = new Derived();
        der.met();

        Int inter = der;
        inter.met();

    }
}

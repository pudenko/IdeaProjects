package com.lessons.igor.ex007_override;

public class Main {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.method();
        Base derived1 = (Base) (derived);
        derived1.method();
        derived1 = (Derived) derived;
        derived1.method();
    }
}
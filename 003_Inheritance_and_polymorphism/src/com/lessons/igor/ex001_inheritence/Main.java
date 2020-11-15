package com.lessons.igor.ex001_inheritence;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        System.out.printf("Поле басе: %s, %s \n", base.protectedString, base.publicString);
        System.out.printf("Поле деривед: %s, %s \n", derived.protectedString, derived.publicString);
    }
}

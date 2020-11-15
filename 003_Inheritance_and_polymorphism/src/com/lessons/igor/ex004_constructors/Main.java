package com.lessons.igor.ex004_constructors;

public class Main {
    public static void main(String[] args) {
        Derived der = new Derived(2,5);
        System.out.printf("Пичатаем: %d, %d", der.baseNumber, der.derivedField);
    }
}

package com.lessons.igor.ex002_inheritence;

public class Base {
    public String publicString = "Это публичное поле, базовый класс";
    private String privateString = "Это приватное поле, базовый класс";
    protected String protectedString = "Это защитное поле, базовый класс";

    public void show() {
        System.out.printf("Приватное поле %s \n", privateString);
    }

    public void showProtected() {
        System.out.printf("Протектед поле %s \n", protectedString);
    }
}


package com.lessons.igor.ex001;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        try {
            a = a / (2 - b);
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
            System.out.println("Ошибка " + e.toString());
        }
    }
}

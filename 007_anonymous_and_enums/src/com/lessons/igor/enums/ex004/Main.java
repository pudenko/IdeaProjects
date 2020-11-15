package com.lessons.igor.enums.ex004;

public class Main {
    public static void main(String[] args) {
        Company my = Company.GOOGLE;
        System.out.println(my);
        int salary = my.getValue();
        String currency = my.getCurrency();
        System.out.println("мой доход " + salary + " " + currency + " в месяц");

        Company my1 = Company.YANDEX;
        System.out.println(my1);
        int salary1 = my1.getValue();
        String currency1 = my1.getCurrency();
        System.out.println("мой доход " + salary1 + " " + currency1 + " в месяц");
    }
}

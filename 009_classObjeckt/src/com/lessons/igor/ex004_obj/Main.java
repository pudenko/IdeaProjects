package com.lessons.igor.ex004_obj;

public class Main {
    public static void main(String[] args) {
        Car tes1 = new Car(2);
        Car tes2 = new Car(4);
        Car test3 = tes1;

        System.out.println(tes1.equals(tes2));//сравнение по ссылкам
        System.out.println(tes1.equals(test3));
    }
}

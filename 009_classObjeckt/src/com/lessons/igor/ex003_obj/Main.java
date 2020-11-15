package com.lessons.igor.ex003_obj;

public class Main {
    public static void main(String[] args) {
        Car tes1 = new Car(2);
        Car tes2 = new Car(4);
        Car test3 = tes1;

        System.out.println(tes1.equals(tes2));//сравнение по ссылкам
        System.out.println(tes1.equals(test3));
        System.out.println(tes1 == tes2);
        System.out.println(tes1 == test3);
        System.out.println(tes1);
        System.out.println(tes2);
        System.out.println(test3);
    }
}

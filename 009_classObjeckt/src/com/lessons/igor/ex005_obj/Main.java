package com.lessons.igor.ex005_obj;

public class Main {
    public static void main(String[] args) {
        Car test1 = new Car(1);
        Car test2 = new Car(1);
        Car test3 = new Car(2);

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
    }

}

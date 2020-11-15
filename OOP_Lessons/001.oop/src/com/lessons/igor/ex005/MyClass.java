package com.lessons.igor.ex005;

import com.lessons.igor.ex001.Car;

public class MyClass {
    public static void main(String[] args) {
        String data = null;
        Car car1 = null;
//        int i = null;
        String text = (String)(null);
        System.out.println(text);
        Car car3 = (Car)(null);
        System.out.println(car3);

        System.out.println(null == null); //true
        System.out.println(car1 == null); //true
//        System.out.println(text.equals(null)); //error
//        car1.getMaxSpeed(); //NullPointerException:(//error)

    }
}

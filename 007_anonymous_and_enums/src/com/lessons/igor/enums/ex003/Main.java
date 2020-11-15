package com.lessons.igor.enums.ex003;

import java.time.DayOfWeek;

enum Company {
    GOOGLE(1000000),SKYNET(3000000),YANDEX(0),FOPPUDENKO(1000000000);
    int value;

    Company(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println(DayOfWeek.of(3));
        Company test = Company.GOOGLE;
        System.out.println(test);
        System.out.println(test.value);
        System.out.println(test.getValue());
    }
}

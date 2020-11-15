package com.lessons.igor.enums.ex001;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
enum Day2 {
    qq, ww, fff, rrr, ggg, tt, yy;
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("today is :" + today);
        int number = 4;
//        today = number;
//        today = "ttt";
        Day2 test = Day2.fff;
//        today = test;
    }
}

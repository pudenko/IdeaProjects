package com.lessons.igor.enums.ex002;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Main {
    public static void main(String[] args) {
//        Day.MONDAY = Day.FRIDAY;//не получится

        Day today = Day.FRIDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            default:
                System.out.println("Сегодня " + today);
        }
        if (today == Day.SATURDAY){
            System.out.println("SATURDAY");
        }
    }
}

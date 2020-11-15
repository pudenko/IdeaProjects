package com.lessons.igor.static_members.ex002_static;

public class NotStaticClass {
    private int id;

    public NotStaticClass(int id) {
        this.id = id;
    }
    public static void test(){
//        System.out.println(id);
        System.out.println("В статик методах нельзя обра. к не статик полям");
    }
}

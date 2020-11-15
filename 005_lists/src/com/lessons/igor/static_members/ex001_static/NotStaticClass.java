package com.lessons.igor.static_members.ex001_static;

public class NotStaticClass {
    private int id;
    public static int field;

    public NotStaticClass(int id) {
        this.id = id;
    }

    public void test() {
        System.out.println("instance[0].field = " + id + "," + field);
    }
}

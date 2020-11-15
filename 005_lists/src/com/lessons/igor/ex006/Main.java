package com.lessons.igor.ex006;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> my = new ArrayList<>();
        my.ensureCapacity(6);
        my.add("Name");
        my.add("SurName");
        my.add("rrr");
        my.add("www");
        my.add("ttt");
        my.add("rrr");
        my.add("qqq");
        System.out.println(my.size());
        System.out.println(my.get(2));
        System.out.println(my.indexOf("rrr"));
        System.out.println(my.lastIndexOf("rrr"));
        System.out.println(my.clone());

    }
}

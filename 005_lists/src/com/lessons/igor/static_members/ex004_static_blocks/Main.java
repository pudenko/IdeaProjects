package com.lessons.igor.static_members.ex004_static_blocks;

public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);
        NotStaticClass test = new NotStaticClass(5);
        System.out.println(NotStaticClass.X);
    }
}

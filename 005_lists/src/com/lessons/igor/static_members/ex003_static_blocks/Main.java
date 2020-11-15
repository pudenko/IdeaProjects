package com.lessons.igor.static_members.ex003_static_blocks;


public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);
        NotStaticClass test = new NotStaticClass();
        System.out.println(NotStaticClass.X);
    }
}

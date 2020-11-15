package com.lessons.igor.static_members.ex003_static_blocks;

public class NotStaticClass {
    public static final int X;
    static {
        X = 6;
        System.out.println("Вызвано с статики с блока : " + "X = " + X);
    }

    public NotStaticClass() {
//        X = 4;
        // статичес.блок вызывается раньше чем конструктор, инициализ.не возможн.
        System.out.println("Конструктор X = " + X);
    }
}

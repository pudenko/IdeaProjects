package com.lessons.igor.static_members.ex004_static_blocks;

public class NotStaticClass {
    static int X;

    static {
        X = 1;
        System.out.println("St1 X=" + X);
    }

    static {
        X = 23;
        System.out.println("St2 X=" + X);
    }

    static {
        X = -99;
        System.out.println("St3 X=" + X);
    }

    public NotStaticClass(int x) {
        X = x;
        System.out.println("Constr x=" + X);
    }
}


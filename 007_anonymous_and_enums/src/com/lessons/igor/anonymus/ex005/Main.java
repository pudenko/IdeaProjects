package com.lessons.igor.anonymus.ex005;

interface Test {
    void pudenko();

    int getValue();
}

public class Main {
    public static void main(String[] args) {
        Test test1 = new Test() {
            int field = 0;

            @Override
            public void pudenko() {
                field = 100;
            }

            @Override
            public int getValue() {
                return field;
            }
        };
        Test test2 = new Test() {
            int field = -1;

            @Override
            public void pudenko() {
                field = test1.getValue();
            }

            @Override
            public int getValue() {
                return field;
            }
        };

        test2.pudenko();
        test1.pudenko();

        System.out.println(test2.getValue());
        System.out.println(test1.getValue());
    }
}

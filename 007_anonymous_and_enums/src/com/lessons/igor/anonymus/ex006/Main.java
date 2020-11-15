package com.lessons.igor.anonymus.ex006;

interface Test {
    void pudenko();

    int getValue();

}

class ConcretClass implements Test {
    protected int protectedField = 10;

    @Override
    public void pudenko() {
        System.out.println("from ConcretClass pudenko");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}

public class Main {
    public static void main(String[] args) {
        ConcretClass test1 = new ConcretClass() {
            @Override
            public void pudenko() {
                System.out.println("test pudenko");
            }
        };
        ConcretClass test2 = new ConcretClass() {
        int protectedField = 3;

            @Override
            public void pudenko() {
                System.out.println("test2 pudenko");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };
        test1.pudenko();
        test2.pudenko();
        System.out.println(test1.getValue());
        System.out.println(test2.getValue());
    }
}

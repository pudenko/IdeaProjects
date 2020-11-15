package com.lessons.igor.interfaces.ex003;

public class Derived extends Base implements One,Two{
    @Override
    public void one() {
        System.out.println("one");
    }

    @Override
    public void two() {
        System.out.println("two");
    }
}

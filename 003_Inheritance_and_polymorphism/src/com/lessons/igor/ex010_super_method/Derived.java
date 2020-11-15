package com.lessons.igor.ex010_super_method;

public class Derived extends Base{
    @Override
    public void test(){
        super.test();
        System.out.println("Derived");
    }
}

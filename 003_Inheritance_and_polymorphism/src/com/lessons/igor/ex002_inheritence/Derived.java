package com.lessons.igor.ex002_inheritence;

public class Derived extends Base {
    Derived(){
        publicString = "Derived public String";
        protectedString = "Derived protected String";
    }
//    @Override
//    public void show(){
////        System.out.printf("Приватное поле %s \n", privateString);
//    }

    @Override
    public void showProtected() {

        System.out.printf("Протектед2   е %s \n", protectedString);
        super.showProtected();
    }
}
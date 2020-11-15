package com.lessons.igor.abstraction.ex004_abstraction;

public class ConcretDerived extends AbstractBase{
    @Override
    public void overRidenMethod() {
//        super.overRidenMethod();
        System.out.println("Вызвано с конкретного метода");
    }

    @Override
    void abstractSimpleMethod() {
        System.out.println("abstractSimpleMethod of ConcretDerived");
    }
}

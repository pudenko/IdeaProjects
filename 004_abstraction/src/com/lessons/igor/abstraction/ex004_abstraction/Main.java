package com.lessons.igor.abstraction.ex004_abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractBase a = new ConcretDerived();
        ConcretDerived b = new ConcretDerived();

        a.simpleMethod();//simpleMethod_AbstractBase
        a.overRidenMethod();//OverRidenMethod_AbstractBase //Вызвано с конкретного метода
        a.abstractSimpleMethod();//null //abstractSimpleMethod of ConcretDerived

        b.simpleMethod();//simpleMethod_AbstractBase
        b.overRidenMethod();//Вызвано с конкретного метода
        b.abstractSimpleMethod();//abstractSimpleMethod of ConcretDerived
    }
}

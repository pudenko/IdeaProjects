package com.lessons.igor.static_members.ex006_abstract_class;

public class Main {
    public static void main(String[] args) {
        Conkret pudenko = new Conkret();
        pudenko.test();
        Conkret.CreateObjekt().test();

        Abstract ppp = new Conkret();
        Abstract ppp1 = Abstract.CreateObjekt();
        Abstract.CreateObjekt().test();

    }
}

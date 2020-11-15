package com.lessons.igor.static_members.ex006_abstract_class;

public abstract class Abstract {
    public static Abstract CreateObjekt() {
        return new Conkret();
    }

    public abstract void test();
}

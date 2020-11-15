package com.lessons.igor.ex003_constructors;

public class Derived extends Base{
    public int derivedField;

    public Derived(int baseNumber, int derivedField) {
        this.baseNumber = baseNumber;
        this.derivedField = derivedField;
    }
}

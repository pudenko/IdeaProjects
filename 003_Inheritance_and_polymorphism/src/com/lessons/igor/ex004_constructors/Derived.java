package com.lessons.igor.ex004_constructors;

public class Derived extends Base {
    public int derivedField;

    public Derived(int baseNumber, int derivedField) {
        super(baseNumber);
        this.derivedField = derivedField;
    }
}

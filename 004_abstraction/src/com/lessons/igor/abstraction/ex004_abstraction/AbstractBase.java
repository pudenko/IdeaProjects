package com.lessons.igor.abstraction.ex004_abstraction;

public abstract class AbstractBase {
        public void simpleMethod(){
            System.out.println("simpleMethod_AbstractBase");
        }
        public void overRidenMethod(){
            System.out.println("OverRidenMethod_AbstractBase");
        }
        abstract void abstractSimpleMethod();
}

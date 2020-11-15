package com.lessons.igor.abstraction.ex003_abstraction;
abstract class A{
   public abstract void operationA();
}
abstract class B extends A{
    public abstract void operationB();
}
class Pudenko extends B{
    public void operationB(){
        System.out.println("operationB");
    }
    public void operationA(){
        System.out.println("operationA");
    }

}
public class Main {
    public static void main(String[] args) {
        A test1 = new Pudenko();
        B test2 = new Pudenko();
        test1.operationA();
        test2.operationB();
    }
}

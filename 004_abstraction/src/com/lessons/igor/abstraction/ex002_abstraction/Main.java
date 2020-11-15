package com.lessons.igor.abstraction.ex002_abstraction;
class Public{
    public void operation(){
        System.out.println("operation, вызваный из паблика");
    }
}
abstract class Test extends Public{
    public abstract void Pudenko();
}
class MyPublic extends Test{
    @Override
    public void Pudenko(){
        System.out.println("Тра-та-та");
    }
}

public class Main {
    public static void main(String[] args) {
        Test my = new MyPublic();
        my.Pudenko();
        my.operation();
    }
}

package com.lessons.igor.ex003;

class MyClass {
    public <TEST> void pudenko(TEST yyy) {
        TEST xxx = yyy;
        System.out.println(xxx);
    }
}

class Cat {
}

public class Main {
    public static void main(String[] args) {
        MyClass dd = new MyClass();
        dd.pudenko(5);
        dd.pudenko("tttrrr");
        dd.pudenko(new Cat());
    }
}

package com.lessons.igor.ex007;

class Base {
}

class Derived extends Base {
}

class Derived2 extends Derived {
}

class MyClass<T extends Base> {//<T extends Base> аргумент типа должен являтся или быть производным показ.произв.класса.

}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> test1 = new MyClass<>();
        MyClass<Derived> test2 = new MyClass<>();
//        MyClass<String> test3 = new MyClass<>();//вот так не получится.
        MyClass<Derived2> test4 = new MyClass<>();
    }
}

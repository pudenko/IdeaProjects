package com.lessons.igor.nested_classes.ex006;

class MyClass {
    public static class Nested {
        public static void numberOfDays() {
//            System.out.println("test1 Nested");
            for (int i = 1; i <= 7; i++) {
                System.out.println(i);
            }
        }
    }

}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.numberOfDays();
    }
}

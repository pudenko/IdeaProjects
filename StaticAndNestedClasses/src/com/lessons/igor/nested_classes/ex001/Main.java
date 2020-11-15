package com.lessons.igor.nested_classes.ex001;

public class Main {
    public static void main(String[] args) {
        MyClass.Nested1 my = new MyClass().new Nested1();
        my.test();

        MyClass you = new MyClass();
        MyClass.Nested1 two = you.new Nested1();
        MyClass.Nested2 tree = you.new Nested2();
//        MyClass x;
//       int i = 0;
//       switch (i){
//           case 1: {
//               x = you.new Nested1();
//               break;
//           }
//           case 2: {
//               break;
//           }
//           case 3: {
//               break;
//           }


//       }
    }
}

class MyClass { //клас
    public class Nested1 { //вложеный клас
        public void test() {
            System.out.println("print test of Nested1 class");
        }
    }
    public class Nested2 { //вложеный клас
        public void test() {
            System.out.println("print test of Nested2 class");
        }
    }
    public class Nested3 { //вложеный клас
        public void test() {
            System.out.println("print test of Nested3 class");
        }
    }
}
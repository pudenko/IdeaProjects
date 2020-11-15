package com.lessons.igor.ex005_constructors.private_constructor;

public class Main {
    public static void main(String[] args) {
//        new Animal(4);
        //вызвать приватный конструктор нельзя
        //через метод можно
       Animal.testMethod();
    }
}

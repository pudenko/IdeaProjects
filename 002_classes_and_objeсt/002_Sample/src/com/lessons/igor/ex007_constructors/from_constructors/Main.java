package com.lessons.igor.ex007_constructors.from_constructors;

public class Main {
    public static void main(String[] args) {
        Animal tarakan = new Animal();
        Animal ptichka = new Animal(4);
        Animal oggi = new Animal(6, 3);


        System.out.printf("Возвраст: %d, Высота: %d, Обьект: %s \n",
                tarakan.getAge(),
                tarakan.getHeight(),
                "tarakan");
        System.out.printf("Возвраст: %d, Высота: %d, Обьект: %s \n",
                ptichka.getAge(),
                ptichka.getHeight(),
                "ptichka");
        System.out.printf("Возвраст: %d, Высота: %d, Обьект: %s \n",
                oggi.getAge(),
                oggi.getHeight(),
                "oggi");

    }
}


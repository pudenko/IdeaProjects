package com.lessons.igor.abstraction.ex005_absttaction;

public class Main {
    public static void main(String[] args) {
        Base base = new Conkkret();
        base.simple(); //Я public simple из Base class
        base.abstraktMethod(); //я abstraktMethod из Conkkret

        Conkkret conkkret = new Conkkret();
        conkkret.abstraktMethod(); //я abstraktMethod из Conkkret
        conkkret.simple();  //---------------
    }
}

//        я public simple из Conkkret
//        я abstraktMethod из Conkkret
//        я abstraktMethod из Conkkret
//        я public simple из Conkkret
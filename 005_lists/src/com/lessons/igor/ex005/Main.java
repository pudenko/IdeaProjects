package com.lessons.igor.ex005;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myStringList = new ArrayList<>();
        myStringList.add("4");
        myStringList.add("55");
        myStringList.add("555");
        myStringList.add("8");
        myStringList.add("55");
        myStringList.add("55");
        myStringList.add("55");
        myStringList.add("55");
        myStringList.add(8,"7777");
        System.out.println(myStringList);
        myStringList.add(1,"99");
        System.out.println(myStringList);
        myStringList.remove(0);
        System.out.println(myStringList);


        while (myStringList.remove("55")){}
        System.out.println(myStringList);

    }
}

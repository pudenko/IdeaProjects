package com.lessons.igor.ex007;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> my = new ArrayList<>();
        my.add(3);
        my.add(344);
        my.add(37890);

        Iterator<Integer> you = my.iterator();
        Integer i;
        while (you.hasNext()){
            i = you.next();
            System.out.println(i);
        }

        ListIterator<Integer> oy = my.listIterator();
        Integer y;
        while (oy.hasNext()){
            y = oy.next();
            System.out.println(y);
        }
    }
}

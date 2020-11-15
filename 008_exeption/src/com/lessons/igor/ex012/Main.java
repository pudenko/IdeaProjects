package com.lessons.igor.ex012;

public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}

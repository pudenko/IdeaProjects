package com.lessons.igor.ex007;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int n = 6;
        try {
            System.out.println("попытка деления на 0");
            System.out.println("a/(6-n) = " + a/(6-n));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("блок финалё");
        }
    }
}

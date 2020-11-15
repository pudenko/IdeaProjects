package com.lessons.igor.ex002;

public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("My pudenko Error!!!");

        try {
//            int a = 1 / 0;
            throw ex;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

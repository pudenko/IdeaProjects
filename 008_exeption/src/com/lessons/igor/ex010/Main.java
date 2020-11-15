package com.lessons.igor.ex010;

public class Main {
    public static void main(String[] args) {
        try {
            try {
                try {
                    throw new Exception("exeption1 ");
                } catch (Exception e) {
                    System.out.println("c1 " + e.getMessage());
                    throw new Exception();
                } finally {
                    System.out.println("f1");
                }
            } catch (Exception e) {
                System.out.println("c2 " + e.getMessage());
                throw new Exception();
            } finally {
                System.out.println("f2");
                throw new Exception("new exception");
            }
        } catch (Exception e) {
            System.out.println("c3 " + e.getMessage());

        } finally {
            System.out.println("f3");

        }
    }
}

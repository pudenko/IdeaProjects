package com.lessons.igor.ex003;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Tratata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

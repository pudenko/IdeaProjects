package com.lessons.igor.ex005;

class UserException extends Exception {
    public void test() {
        System.out.println("blablabla");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            e.test();
        }
    }
}

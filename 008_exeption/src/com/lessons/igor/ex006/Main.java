package com.lessons.igor.ex006;

import java.io.FileInputStream;

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
            try {
                FileInputStream ttt = new FileInputStream("C:\\Users\\i.pudenko\\Desktop\\2.txt");
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
    }
}

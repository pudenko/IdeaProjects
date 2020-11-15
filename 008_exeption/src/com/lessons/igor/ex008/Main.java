package com.lessons.igor.ex008;

class UserException extends Exception{
    public void test(){
        System.out.println("мое исключение");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        }catch (UserException e){
            System.out.println("обраб искл 1");
            e.test();
            try {
                throw e;
            }catch (UserException e1){
                System.out.println("обраб искл 2");
                e1.test();
            }
        }
        finally {
            System.out.println("Final");
        }
    }
}

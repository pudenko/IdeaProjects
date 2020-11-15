package com.lessons.igor.ex013;

class MyExeption extends Exception {
    public MyExeption(String s) {
        super(s);
    }
}

class MyExeption2 extends Exception {
    public MyExeption2(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            if (1 == 1)
                throw new Exception("test1");
            if (1 == 1) throw new MyExeption("test2");
            throw new MyExeption2("test3");
        } catch (MyExeption2 e) {
            System.out.println(e.getMessage());
        } catch (MyExeption e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package com.lessons.igor.anonymus.ex004;
interface Test{
    void print();
}

public class Main {
    public static void main(String[] args) {
        int n = 100;

        Test yyy = new Test() {
            public int ineher = 11;
            @Override
            public void print() {
                ineher = n;
                System.out.println(n);
            }
        };
        yyy.print();
    }
}

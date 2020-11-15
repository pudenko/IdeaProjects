package com.lessons.igor.ex004;

class My {
    public void test() throws Exception {
        Exception pudenko = new Exception("tratata");
        throw pudenko;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            My tet = new My();
            tet.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Stake trace");
            e.printStackTrace();
        }
    }
}

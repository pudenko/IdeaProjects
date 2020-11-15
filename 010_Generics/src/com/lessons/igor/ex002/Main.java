package com.lessons.igor.ex002;

class Generic<TYPE1, TYPE2> {
    public TYPE1 test1;
    public TYPE2 test2;

    public Generic(TYPE1 test1, TYPE2 test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

}

public class Main {
    public static void main(String[] args) {
        Generic<Integer, Integer> pudenko1 = new Generic<>(2, 3);
        System.out.println(pudenko1.test1 + pudenko1.test2);

        Generic<String, Integer> pudenko2 = new Generic<>("Number ", 3);
        System.out.println(pudenko2.test1 + pudenko2.test2);

        Generic<String, String> pudenko3 = new Generic<>("Hello", "World");
        System.out.println(pudenko3.test1 + " " + pudenko3.test2);
    }
}

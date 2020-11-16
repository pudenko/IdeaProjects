package com.lessons.igor.ex006;

class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }
        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }
        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> pudenko = new MyClass<>();
        System.out.println(pudenko.add(3, 4));
        MyClass<Double> pudenko1 = new MyClass<>();
        System.out.println(pudenko1.add(3.55, 5.444));
        MyClass<Float> pudenko2 = new MyClass<>();
        System.out.println(pudenko2.add(4.4F, 1F));
    }
}

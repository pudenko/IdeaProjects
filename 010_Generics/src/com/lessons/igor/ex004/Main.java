package com.lessons.igor.ex004;

abstract class Shape {
}

class Circle extends Shape {
}

interface Icontainer<T> {
    T getFigure();

    void setFigure(T figure);
}

class Container<T> implements Icontainer<T> {
    private T figura;

    public Container(T figura) {
        this.figura = figura;
    }

    @Override
    public T getFigure() {
        return figura;
    }

    @Override
    public void setFigure(T figure) {
        this.figura = figure;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Icontainer<Circle> pudenko = new Container<>(circle);
        System.out.println(pudenko.getFigure());

        Circle circle1 = new Circle();
        pudenko.setFigure(circle1);
        System.out.println(pudenko.getFigure());


    }
}

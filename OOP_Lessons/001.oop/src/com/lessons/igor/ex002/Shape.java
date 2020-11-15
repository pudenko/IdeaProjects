package com.lessons.igor.ex002;

public class Shape {
    private int length;
    private long heigth;
    public double square;

    public Shape(){}

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    public long getHeigth(){
        return heigth;
    }
    public void setHeigth(long heigth){
        this.heigth = heigth;
    }

    public void viewShape(){
        System.out.printf("Высота: %d \nДлина: %d", heigth, length);
    }

}

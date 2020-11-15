package com.lessons.igor.ex011_final_class;
final class FC{
    public int x,y;
}

//class Derived extends FC{ //Final не наследуется
//
//}

public class Main {
   public static void main(String[] args) {
        FC fc = new FC();
        fc.x = 1;
        fc.y = 2;
         System.out.printf("X = %d \nY = %d", fc.x, fc.y);
    }
}

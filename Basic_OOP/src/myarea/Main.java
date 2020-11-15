package myarea;

public class Main {
    public static void main(String[] args) {
        double circle = 74.442;
        double result = 0;

        MyArea my = new MyArea();
        result = my.areaOfCircle(circle);

        System.out.printf("%.2f \n", result);
        System.out.println(result);
    }

}

package car2;

public class Car {
    int year;
    double speed;
    int feat;
    String color;


    Car(int year) {
        this(year, 10);
    }
    Car(int year, double speed) {
        this(year, speed, 500);

    }
    Car(int year, double speed, int feat) {
        this(year, speed, feat, "Green");

    }
    Car(int year, double speed, int feat, String color) {
        this.year = year;
        this.speed = speed;
        this.feat = feat;
        this.color = color;
    }




}

package new3;

public class Circle extends Figures {
    public Circle() {
//        this.radius = 10.0f;
        this(10.0f);
    }
    public Circle(float radius) {
        this.radius = radius;
    }

    public float area (){

       return ((float)(Math.round(100*Math.PI*Math.pow(radius,2)))/100);
    }
}
//    public static double roundAvoid(double value, int places) {
//        double scale = Math.pow(10, places);
//        return Math.round(value * scale) / scale;
//    }
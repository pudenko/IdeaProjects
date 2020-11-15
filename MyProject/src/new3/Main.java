package new3;

public class Main {
    public static void main(String[] args) {
        Figures circle = new Circle(20f);
        Figures triangle = new Triangle();
        Figures square = new Square();
        Figures rhombus = new Rhombus();

        circle.showMyYourArea();
        square.showMyYourArea();
    }
}

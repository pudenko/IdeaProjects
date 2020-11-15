package new3;

public class Square extends Figures{
    public Square() {
        this(20f);
    }
    public Square(float lenghtSide){this.lenghtSide = lenghtSide;}

    public float area() {
        return (float)Math.pow(this.lenghtSide, 2);
    }

}

package new3;

 public abstract class Figures  {
     float radius;
     float lenghtSide;
    abstract public float area ();
    public void showMyYourArea(){
        System.out.printf("The Area of figure %s is %.2f \n", getClass().getSimpleName(), area());
    }
}

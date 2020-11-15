package constructors;

public class Constr1 {

    int t;

    public Constr1(int t){
        this( t, 10);
        if(this.t == 0){
            System.out.println("ALARM MOTHER FUCKERS");
        }

    }
    public Constr1(int t, int r){
        this.t = t - r;
    }
    public Constr1(String t){}

}

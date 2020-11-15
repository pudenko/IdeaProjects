package naw6;

public class Matrehka {
    static int count;
    int hight;
    Matrehka junior;

    public Matrehka(int hight, Matrehka junior) {
        count++;
        this.hight = hight;
        this.junior = junior;
    }


}

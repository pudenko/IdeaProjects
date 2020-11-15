package cat;

public class Cat {
    Ears ear1;
    Ears ear2;
    int cntTail;
    int cntLeg;
    public String name;

    public Cat(String name, int leg, Ears ear1, Ears ear2, int tail) {
        this.name = name;
        this.cntLeg = leg;
        this.cntTail = tail;
        this.ear1 = ear1;
        this.ear2 = ear2;
    }

    public void run() {
        System.out.println("побежал");
    }

    public void sleep() {
        System.out.println("сплю");
    }

    public String shit() {
        String govno = "";
        System.out.println("сру");
        return govno;
    }

    public void pochesat(Ears ear) {
        ear.pochesat();
    }

}

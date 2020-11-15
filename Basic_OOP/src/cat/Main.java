package cat;

public class Main {

    public static void main(String[] args) {
        String name1 = "Barsik";
        String name2 = "Kiska";

        Cat cat1 = new Cat( name1,4, new Ears("Left", true), new Ears("Right"),  1);
        Cat cat2 = new Cat(name2,3, new Ears("Left", true), new Ears("Right"), 0);

        chuxchuxears(cat1, "Left");
        chuxchuxears(cat2, "Right");

    }

    public static void chuxchuxears(Cat cat, String ear){

        Ears currEar;

        if(cat.ear1.ear.equals(ear)){
            currEar = cat.ear1;
        }
        else {
            currEar = cat.ear2;
        }

        System.out.print("" + cat.name + " react on pochesatb " + currEar.ear + " ear. "  );
        cat.pochesat(currEar);
    }


}

package cat;

public class Ears {

    String ear;
    boolean favoriteEar;

    Ears(String ear) {
        this.ear = ear;
        this.favoriteEar = false;
    }

    Ears(String ear, boolean favoriteEar) {
        this.ear = ear;
        this.favoriteEar = favoriteEar;
    }

    public void pochesat() {
        if (this.favoriteEar) {
            System.out.println("Mrrrr");
        } else
            System.out.println("Shhhhh");

    }

}

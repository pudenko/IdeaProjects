package new1;

public class Pinguie extends Bird{

    public Pinguie() {
        this.canFly = false;
        this.name = "Pinguie";
        this.canWalk = true;
        this.canRun = true;
        this.canSwim = true;
        this.canUpgrade = false;
    }

    @Override
    public void dropAnimal(String element) {
        switch (element){
            case "water":{
                if(canSwim){
                    System.out.println("Go swim");
                }
                else System.out.println("No swim");
                break;
            }
            case "air": {
                if(canFly){
                    System.out.println("I can fly");
                }
                else System.out.println("I am bird but i cant fly");
                break;
            }
            case "space":{
                if(canUpgrade){
                    System.out.println("What are you doing");
                }
                else System.out.println("Dead");
                break;
            }
            default:
                System.out.println("Error");
        }
    }
}

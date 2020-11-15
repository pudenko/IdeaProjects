package new1;

public class Animal {
    int id;

    String kind;
    String classAnimal;
    String breed;
    String name;
    String skin;
    boolean haveWings;
    boolean haveHead;
    boolean haveBody;
    boolean haveAyes;
    boolean haveTail;
    boolean haveLegs;
    boolean canFly;
    boolean canSwim;
    boolean canRun;
    boolean canWalk;
    boolean canUpgrade;

    public void sayWhatYouCan(){
        System.out.printf("Животное %s:%n%s%n%s%n%s%n%s%n%s%n",
                this.name,
                this.canFly?"Умеет летать":"Не умеет летать",
                this.canRun?"Умеет бегать":"Не умеет бегать",
                this.canSwim?"Умеет плавать":"Не умеет плавать",
                this.canWalk?"Умеет ходить":"Не умеет ходить",
                this.canUpgrade?"Умеет хз":"Не умеет хз");
    }
    public void dropAnimal(String element){
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
               else System.out.println("I am crash");
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

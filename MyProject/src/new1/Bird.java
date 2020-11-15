package new1;

public class Bird extends Vertebrates{
    public Bird() {
    }

    Bird(String name){
        this.canFly = true;
        this.name = name;
        this.canWalk = false;
        this.canRun = false;
        this.canSwim = false;
        this.canUpgrade = false;
    }
    Bird(String name, boolean canFly, boolean canWalk, boolean canRun, boolean canSwim, boolean canUpgrade){
        this.canFly = canFly;
        this.name = name;
        this.canWalk = canWalk;
        this.canRun = canRun;
        this.canSwim = canSwim;
        this.canUpgrade = canUpgrade;
    }


    //    Bird(boolean canFly){
////        super(canFly);
//        this.canFly = canFly;
////        System.out.println("Вот разница");
//    }
}

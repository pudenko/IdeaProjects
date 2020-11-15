package new1;

public class Main {
    public static void main(String[] args){
        Animal bird1 = new Pinguie();
        Animal bird2 = new Strause();
        Animal bird3 = new Dowe();
        Animal fish1 = new Shark();
        Animal fish2 = new Perch();
        Animal fish3 = new Treska();
        Animal Hawk = new Bird("Hawk");
        Animal Kanary = new Bird("Kanary",true,true,false,false,false);
        bird1.dropAnimal("air");
        bird2.dropAnimal("air");
//        Hawk.sayWhatYouCan();
//        Kanary.sayWhatYouCan();
//        Kanary.dropAnimal("water");
//        fish1.dropAnimal("air");
//    bird1.sayWhatYouCan();
//    bird2.sayWhatYouCan();
//    bird3.sayWhatYouCan();
//    fish1.sayWhatYouCan();
//    fish2.sayWhatYouCan();
//    fish3.sayWhatYouCan();
    }
}

package new5;

public class Cat {
    String name;
    int age;
    private static int catCount;

    {
        catCount = 20;
    }

    static{
        catCount = 88;
    }


    public Cat(String name, int age) {
        catCount++;
        this.name = name;
        this.age = age;
    }

    public static int getCatCount() {
        return catCount;
    }
}

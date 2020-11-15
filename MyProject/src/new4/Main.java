package new4;

public class Main {
    public static void main(String[] args) {
        Employ man1 = new Employ("Jhon","123", "advansed");
        Employ woman1 = new Employ("Lindsey","345", "base");
        Employ this1 = new Employ("Piter","678");

        Default1 emp = new JobPossibility();
        emp.ShowYourName(this1);


        Base emp1 = new JobPossibility();
        Base emp2 = new JobPossibility();
        emp1.ChangeName(this1,"Krol");
        emp1.ShowYourName(this1);
        emp1.ShowYourName(man1);

        Advansed gfdgd = new JobPossibility();


        Base jp = new JobPossibility();

        System.out.println(man1.getName());


    }
}

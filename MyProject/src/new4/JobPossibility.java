package new4;

public class JobPossibility implements Default1, Base, Advansed{
    @Override
    public void ShowYourName(Employ employ) {
        System.out.println(employ.name);
    }

    @Override
    public void ChangePassword(Employ employ, String pass) {
        employ.password = pass;
    }

    @Override
    public void ChangeName(Employ employ, String name) {
        employ.name = name;
    }
}

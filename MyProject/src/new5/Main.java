package new5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean prog = true;
        Scanner in = new Scanner(System.in);
        int couunt = 0;

        while(prog){
            System.out.println("Для выбода введите 0");
            System.out.println("Введите кличку животного: ");
            String name = in.nextLine();
            if (name.equals("0")) {
                prog = false;
            }
            else {
                System.out.println("Введите целочисленный возраст: ");
                int age = Integer.parseInt(in.nextLine());
                Cat eminem = new Cat(name,age);

                System.out.println("Count of cats: " + Cat.getCatCount());
                couunt++;
                System.out.printf("Кличка: %s возраст: %d года \n", eminem.name, age);
            }
            System.out.println(couunt);
        }
        System.out.println("Bay - bay!!!");
    }
}

/*
        разобрать матрешку
        сколько частей в матрешке
        какая висота в каждой матрешке
*/


package naw6;

public class Main {

    public static void main(String[] args) {
        int hight = 5;
        Matrehka matrehka = null;
        // создали матрешки
        for (int i = 0; i < 50; i++) {
            matrehka = new Matrehka(hight,matrehka);
            hight+=5;
        }
        //обход матрешки..., вывод результатов!
        while (matrehka != null){
            System.out.printf("Высота матрешки: %d \n", matrehka.hight);
            matrehka = matrehka.junior;
        }
        System.out.printf("Количество матрешек: %d \n", Matrehka.count);
    }
}

package vehicle;

//Требуется:   Создать класс Vehicle.
//        В теле класса создайте поля:
//        координаты и параметры средств передвижения
//        (цена, скорость, год выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена
//        высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки.
//        Написать программу,
//        которая выводит на экран информацию
//        о каждом средстве передвижения.


public class Vehicle {
//    float x;
//    float y;
    float price;
    float speed;
    int year;
    float height;
    int passangersSeads;
    String place;

    public void ShowInformationVehicle() {
        System.out.println("" + this.getClass().getName());
//        if (this.place == null ) this.place = " no information";
        System.out.printf("price = %.2f \nspeed = %.2f \nyear = %d \nheight = %.2f \n" +
                        "passangersSeads = %d \nplace = %s\n",
                this.price,
                this.speed,
                this.year,
                this.height,
                this.passangersSeads,
                this.place == null? "no information": this.place );
    }

}

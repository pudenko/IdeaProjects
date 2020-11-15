package vehicle;



public class Main {
    public static void main(String[] args) {
       Vehicle plane = new Plane(3400,1000,1988,8000,10);
       Vehicle car = new Car(300,320,2004);
        Vehicle ship = new Ship(34000,60,2000,30,"Kiev");
        plane.ShowInformationVehicle();
        car.ShowInformationVehicle();
        ship.ShowInformationVehicle();
    }
}

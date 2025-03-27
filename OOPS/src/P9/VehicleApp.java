package q9;
public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.accelerate();
        car.accelerate(50);
        car.accelerate(50, 1.5);
        car.brake();

        bicycle.accelerate();
        bicycle.accelerate(10);
        bicycle.accelerate(10, 2);
        bicycle.brake();
    }
}

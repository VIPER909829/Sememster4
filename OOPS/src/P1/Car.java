package q1;

public class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}
class CarTester{
    public static void main(String[] args) {
        Car mC1=new Car("Mercedes", "Benz");
        Car mC2=new Car(null, null);
        System.out.println("\nInitial Details of mC1: ");
        mC1.display();
        System.out.println("\nInitial Details of mC2: ");
        mC2.display();
        mC2.setMake("Audi");
        mC2.setModel("Q3");
        System.out.println("\nUpdated Details of mC2: ");
        mC2.display();
    }
}


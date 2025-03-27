package q9;
class Car implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
    public void accelerate(double speed) {
        System.out.println("Car is accelerating at " + speed + " kmph");
    }
    public void accelerate(double speed, double duration) {
        System.out.println("Car is accelerating at " + speed + " kmph for " + duration + " minutes");
    }
    public void brake() {
        System.out.println("Car is braking...");
    }
}
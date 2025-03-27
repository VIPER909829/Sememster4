package q9;

class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating...");
    }
    public void accelerate(double speed) {
        System.out.println("Bicycle is accelerating at " + speed + " kmph");
    }
    public void accelerate(double speed, double duration) {
        System.out.println("Bicycle is accelerating at " + speed + " kmph for " + duration + " minutes");
    }
    public void brake() {
        System.out.println("Bicycle is braking...");
    }
}
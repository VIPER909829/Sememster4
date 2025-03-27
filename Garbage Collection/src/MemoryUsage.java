package assignment4;
public class MemoryUsage {
    private int intValue;
    private double doubleValue;

    MemoryUsage(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());

        MemoryUsage obj1 = new MemoryUsage(10, 20.5);
        MemoryUsage obj2 = new MemoryUsage(15, 30.5);

        obj1 = null; // Making object unreachable
        obj2 = null;
        System.gc(); // Invoke garbage collection

        System.out.println("After GC - Free memory: " + runtime.freeMemory());
    }
}


package assignment4;

import java.util.ArrayList;

class MemoryIntensive {
    public static void main(String[] args) {


        Runtime runtime = Runtime.getRuntime();
        ArrayList<int[]> objects = new ArrayList<>();

        // Create a large number of objects
        for (int i = 0; i < 10000; i++) {
            objects.add(new int[1000]); // Allocate large memory
        }

        // Memory status before garbage collection
        System.out.println("Before GC:");
        System.out.println("Time spam "+System.currentTimeMillis());
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
        objects = null;
        System.gc();
        System.out.println("\nAfter GC:");

        System.out.println("Free memory: " + runtime.freeMemory());

    }
}


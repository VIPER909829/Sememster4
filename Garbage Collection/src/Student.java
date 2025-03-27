package assignment4;
public class Student {
    String name;
    String course;
    Student(String name, String course) {
        this.name = name;
        this.course = course;
    }
    @Override
    protected void finalize () throws Throwable  {
        System.out.println(name + " is being garbage collected.");
    }
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory());
        System.out.println("Free memory: " + runtime.freeMemory());
        Student student1 = new Student("Alice", "CS");
        Student student2 = new Student("Bob", "IT");
        student1 = null; // Making student1 unreachable
        student2 = null;
        System.gc(); // Invoke garbage collection
        System.out.println("After GC - Free memory: " + runtime.freeMemory());
    }
}


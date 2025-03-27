package assignment4;

public class ReassigningReference {
    String name;

    ReassigningReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        ReassigningReference obj1 = new ReassigningReference("Object 1");
        ReassigningReference obj2 = new ReassigningReference("Object 2");

        obj1 = obj2; // obj1 now refers to obj2, making "Object 1" unreachable
        System.gc(); // Trigger garbage collection
    }
}


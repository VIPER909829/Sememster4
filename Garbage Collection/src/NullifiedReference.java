package assignment4;

public class NullifiedReference {
    String name;

    NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        NullifiedReference obj = new NullifiedReference("Temporary Object");
        obj = null; // Nullifying the reference
        System.gc(); // Call garbage collector
    }
}


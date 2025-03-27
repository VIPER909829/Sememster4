package assignment4;

public class AnonymousObject {
    String name;

    AnonymousObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        new AnonymousObject("Anonymous Object"); // Object created but has no reference
        System.gc(); // Force garbage collection
    }
}


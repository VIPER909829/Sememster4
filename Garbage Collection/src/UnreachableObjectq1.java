package assignment4;

public class UnreachableObject {
    String name;

    UnreachableObject(String name) {
        this.name = name;
    }

    void show() {
        UnreachableObject obj = new UnreachableObject("Temporary Object");
        obj.display();
    }

    void display() {
        UnreachableObject anotherObj = new UnreachableObject("Inner Object");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }

    public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();
        obj = null;
        System.gc(); // Explicitly call garbage collector
    }
}

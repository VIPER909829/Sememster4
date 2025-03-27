package p1;
//for using private
public class A2Private {
    int abc=10;
    private void display() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        A2Private obj = new A2Private();
        obj.display();
        System.out.println(obj.abc);
    }
}
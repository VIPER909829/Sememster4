package assignment3;
import java.util.Scanner;

public class SquareRootP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int number = scanner.nextInt();
            if (number < 0) throw new ArithmeticException("Cannot find square root of negative numbers.");
            System.out.println("Square Root: " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

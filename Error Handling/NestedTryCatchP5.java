package assignment3;
import java.util.Scanner;

public class NestedTryCatchP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());

            try {
                int result = 100 / num;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}

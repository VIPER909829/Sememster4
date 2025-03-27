package assignment3;

import java.util.Scanner;

public class InputMismatchHandlingP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}

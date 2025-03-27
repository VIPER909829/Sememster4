package assignment3;

import java.util.Scanner;

public class StringToIntegerP3 {
    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        int result = convertToInt(input);
        if (result != -1) {
            System.out.println("Converted Integer: " + result);
        }
    }
}

package assignment3;
import java.util.Scanner;

public class ExtractNumbersP1 {
    public static void extractNumbers(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Error: Input string is null or empty!");
        }

        String numbers = input.replaceAll("[^0-9]", ""); // Keep only digits

        if (numbers.isEmpty()) {
            System.out.println("No numeric characters found.");
        } else {
            System.out.println("Extracted Numbers: " + numbers);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            extractNumbers(input);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

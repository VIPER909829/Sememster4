package assignment3;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

public class CheckedExceptionDemoP8 {
    public static void validate(int num) throws CustomCheckedException {
        if (num < 0) {
            throw new CustomCheckedException("Number cannot be negative!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}

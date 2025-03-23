package assignment3;

class CustomNullPointerException extends Exception {
    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class CustomExceptionDemoP2 {
    public static void checkString(String str) throws CustomNullPointerException {
        if (str == null) {
            throw new CustomNullPointerException("Custom Error: Null String Provided!");
        }
        System.out.println("Valid String: " + str);
    }

    public static void main(String[] args) {
        try {
            checkString(null);
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

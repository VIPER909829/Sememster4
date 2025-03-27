package assignment3;
import java.io.File;
import java.io.FileNotFoundException;

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class FileHandlerP10 {
    public static void main(String[] args) {
        String filePath = "non_existent.txt";
        try {
            File file = new File(filePath);
            if (!file.exists()) throw new FileNotFoundException("File not found: " + filePath);
            if (!file.canRead()) throw new FileReadPermissionException("Cannot read the file.");
        } catch (FileNotFoundException | FileReadPermissionException e) {
            System.out.println(e.getMessage());
        }
    }
}

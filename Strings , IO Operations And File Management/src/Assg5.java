package assignment6;

import java.io.*;
import java.util.Scanner;

public class Assg5 {

    // Q1 - Compare string creation techniques
    public static void stringCreationComparison() {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println("a == b: " + (a == b));         // true (string pool)
        System.out.println("a == c: " + (a == c));         // false (different memory)
        System.out.println("a.equals(c): " + a.equals(c)); // true (content comparison)
    }

    // Q2 - Immutability and CharSequence interface
    public static void stringImmutabilityAndCharSequence() {
        String s = "Test";
        s.concat("123");  // Doesn't modify 's'
        System.out.println("After concat (immutable): " + s);

        CharSequence cs = s;
        System.out.println("Char at index 2: " + cs.charAt(2));
    }

    // Q3 - Simple text operations with StringBuffer
    public static void simpleTextEditorStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(6, "Java ");
        sb.delete(0, 1);
        sb.reverse();

        System.out.println("Edited Text (Buffer): " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }

    // Q4 - Simple text operations with StringBuilder
    public static void textEditorStringBuilder() {
        StringBuilder sb = new StringBuilder("Code");
        sb.append(" Editor");
        sb.insert(4, " Java");
        sb.setCharAt(0, 'M');
        sb.delete(0, 1);

        System.out.println("Edited Text (Builder): " + sb);
    }

    // Q5 - Case operations and string comparison
    public static void stringCaseAndCompare() {
        String s1 = "Hello";
        String s2 = "hello";

        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));
        System.out.println("To Upper Case: " + s1.toUpperCase());
        System.out.println("To Lower Case: " + s2.toLowerCase());
    }

    // Q6 - Character search in string
    public static void charSearchInString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);

        System.out.println("First Occurrence: " + input.indexOf(ch));
        System.out.println("Last Occurrence: " + input.lastIndexOf(ch));
    }

    // Q7 - Replace word in a sentence
    public static void wordReplacement() {
        String sentence = "I like apples";
        String modified = sentence.replace("apples", "bananas");

        System.out.println("After Replacement: " + modified);
    }

    // Q8 - Basic String Operations via menu
    public static void stringExplorerMenu() {
        Scanner sc = new Scanner(System.in);
        String input = "Explorer";

        System.out.println("1. To Uppercase\n2. To Lowercase\n3. Search Character\n4. Concat String");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1 -> System.out.println(input.toUpperCase());
            case 2 -> System.out.println(input.toLowerCase());
            case 3 -> {
                System.out.print("Enter character to search: ");
                char ch = sc.next().charAt(0);
                System.out.println("Character index: " + input.indexOf(ch));
            }
            case 4 -> {
                System.out.print("Enter string to concatenate: ");
                String add = sc.nextLine();
                System.out.println("Concatenated string: " + input.concat(add));
            }
            default -> System.out.println("Invalid choice");
        }
    }

    // Q9 - Create and write to file
    public static void createAndWriteFile() throws IOException {
        File file = new File("demo.txt");

        if (file.createNewFile()) {
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("Hello File");
            }
            System.out.println("File created and content written.");
        } else {
            System.out.println("File already exists.");
        }
    }

    // Q10 - Read from file
    public static void readFileContent() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Q11 - Append to diary.txt
    public static void appendToDiary() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("diary.txt", true))) {
            bw.write("Entry at " + java.time.LocalDateTime.now());
            bw.newLine();
            bw.write("Today I practiced Java file handling.");
            bw.newLine();
        }
        System.out.println("Diary entry added.");
    }

    // Q12 - List files in current directory
    public static void listFilesInDirectory() {
        File dir = new File(".");
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // Q13 - Delete a file
    public static void deleteFile() {
        File file = new File("delete.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Deletion failed.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    // Q14 - Copy content from one file to another
    public static void copyFileContent() throws IOException {
        try (FileInputStream in = new FileInputStream("source.txt");
             FileOutputStream out = new FileOutputStream("dest.txt")) {

            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        }

        System.out.println("File content copied.");
    }

    // Q15 - Rename a file
    public static void renameFile() {
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Rename failed.");
        }
    }

    // Q16 - Display file metadata
    public static void displayFileMetadata() {
        File file = new File("demo.txt");

        if (file.exists()) {
            System.out.println("File Length: " + file.length());
            System.out.println("Last Modified: " + new java.util.Date(file.lastModified()));
        } else {
            System.out.println("File not found.");
        }
    }

    public static void main(String[] args) throws IOException {
        stringCreationComparison();
        stringImmutabilityAndCharSequence();
        simpleTextEditorStringBuffer();
        textEditorStringBuilder();
        stringCaseAndCompare();
        // charSearchInString(); // requires input
        wordReplacement();
        // stringExplorerMenu(); // requires input
        createAndWriteFile();
        readFileContent();
        appendToDiary();
        listFilesInDirectory();
        deleteFile();
        copyFileContent();
        renameFile();
        displayFileMetadata();
    }
}


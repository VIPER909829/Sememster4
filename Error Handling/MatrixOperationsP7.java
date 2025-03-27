package assignment3;

public class MatrixOperationsP7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};

        try {
            System.out.println("Element: " + matrix[2][1]);  // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Matrix index out of bounds.");
        }
    }
}

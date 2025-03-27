package assignment3;

import java.util.Arrays;

public class ArrayOperationsP6 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 2};

        try {
            Arrays.sort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
            System.out.println("Element at index 10: " + arr[10]);  // Out of bounds access
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried accessing an invalid index.");
        }
    }
}


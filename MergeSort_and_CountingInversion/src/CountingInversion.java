package assignment6;
public class CountingInversion {
    public static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2;
        int count = 0;
        count += mergeSortAndCount(arr, left, mid);
        count += mergeSortAndCount(arr, mid + 1, right);
        count += mergeAndCount(arr, left, mid, right);
        return count;
    }
    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];
        System.arraycopy(arr, left, leftArr, 0, leftArr.length);
        System.arraycopy(arr, mid + 1, rightArr, 0, rightArr.length);
        int i = 0, j = 0, k = left, swaps = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                swaps += (mid + 1) - (left + i);
            }
        }
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];
        return swaps;
    }
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int inversionCount = mergeSortAndCount(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nTotal Inversions: " + inversionCount);
    }
}

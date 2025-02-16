package BinarySearch;

public class CountRotationsNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Sorted array rotated 3 times
        int rotations = countRotations(arr);
        System.out.println("The array has been rotated " + rotations + " times.");
    }

    private static int countRotations(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}

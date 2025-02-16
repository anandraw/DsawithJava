package BinarySearch;

public class BainarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int result = binarySearch(arr, target);
        System.out.println("Index of target: " + result);
    }

    public static int binarySearch(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] > target) {
                end = mid - 1; // Target is in the left half
            } else {
                start = mid + 1; // Target is in the right half
            }
        }

        return -1; // Target not found
    }
}

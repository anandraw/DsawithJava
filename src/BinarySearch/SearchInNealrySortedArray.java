package BinarySearch;

public class SearchInNealrySortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70}; // Almost sorted array
        int target = 40;
        int result = findTarget(arr, target);
        System.out.println("Index of target: " + result); // Output: 2

    }
    public  static int findTarget(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // Correct calculation of mid

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // Check the left neighbor (ensure mid > start to avoid out-of-bounds)
            if (mid > start && arr[mid - 1] == target) {
                return mid - 1;
            }

            // Check the right neighbor (ensure mid < end to avoid out-of-bounds)
            if (mid < end && arr[mid + 1] == target) {
                return mid + 1;
            }

            // Adjust the search range
            if (target < arr[mid]) {
                end = mid - 1; // Search in the left half
            } else {
                start = mid + 1; // Search in the right half
            }
        }

        // Target not found
        return -1;

    }
}

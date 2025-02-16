package BinarySearch;

public class MinEleDiffInSortedArray {
    public static void main(String[] args) {
        int [] arr ={1,3,8,10,15}; int target=12;
        int result = findMinDiff(arr,target);
        System.out.println(result);
    }

    private static int findMinDiff(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Binary search to find the position of the target or the closest elements
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];  // Exact match found
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // After the loop, start and end will be the closest indices
        // Handle edge cases where start or end are out of bounds
        if (start >= arr.length) {
            return arr[end];  // Target is greater than all elements
        } else if (end < 0) {
            return arr[start];  // Target is smaller than all elements
        } else {
            // Compare the differences between the target and the elements at start and end
            int diffStart = Math.abs(arr[start] - target);
            int diffEnd = Math.abs(arr[end] - target);

            if (diffStart < diffEnd) {
                return arr[start];
            } else {
                return arr[end];
            }
        }
    }
}

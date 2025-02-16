package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
       int[] nums = {4,5,6,7,0,1,2}; int target = 5;
        int search = search(nums, target);

        System.out.println(search);
    }

    public  static int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        // Find the pivot (minimum element)
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivot = left;
        left = 0;
        right = nums.length - 1;

        // Decide which part of the array to perform binary search on
        if (target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot;
        }

        // Binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }
}

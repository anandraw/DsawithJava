package BinarySearch;

public class FindCeilInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19}; // Sorted array
        int target = 20;
        int ceilIndex = findCeil(arr, target);
        if (ceilIndex != -1) {
            System.out.println("Ceil of " + target + " is " + arr[ceilIndex]);
        } else {
            System.out.println("No ceil exists for " + target);
        }
    }

    static int findCeil(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1; // No ceil exists
        }

        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ceil = -1;

        while (left<=right){
            int mid = left+(right-left)/2;

             if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            }
            else {
                ceil=mid;
                right=mid-1;
            }
        }
        return ceil;
    }
}

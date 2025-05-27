package GggeksForGeeks.Ocnntest;

public class OprationToMake {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(minOperation(arr));
    }
    static  public long minOperation(int[] arr) {
        // code here
        int n = arr.length;
        long totalOperations = 0;

        // Iterate over all possible subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Calculate the number of changes needed to make the current subarray a palindrome
                totalOperations += minChangesForPalindrome(arr, start, end);
            }
        }

        return totalOperations;
    }

    private static long minChangesForPalindrome(int[] arr, int start, int end) {
        long changes = 0;

        // Compare elements from both ends of the subarray
        while (start < end) {
            if (arr[start] != arr[end]) {
                changes++;  // If elements are not equal, we need to change one of them
            }
            start++;
            end--;
        }

        return changes;

    }
}

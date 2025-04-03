package GggeksForGeeks;

//Kadane's Algorithm
public class Day10 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));

    }
    static int maxSubarraySum(int[] arr) {
        // Your code here
        int maxSum = Integer.MIN_VALUE;
        int maxEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEnd += arr[i];
            if (maxEnd > maxSum) {
                maxSum = maxEnd;
            }
            if (maxEnd < 0) {
                maxEnd = 0;
            }
        }
        return maxSum;
    }
}

package Array.Hard;

import java.util.Arrays;

public class MaxCircularSubarraySum {
    public static void main(String[] args) {
        int  arr[] = {8, -8, 9, -9, 10, -11, 12};
        int ans = circularSubarraySum(arr);
        System.out.println(ans);
    }
    public static int circularSubarraySum(int arr[]) {
        //kedanes alogorrithm
        int n = arr.length;
        int totalSum = Arrays.stream(arr).sum();

        int minSum = kadanesMin(arr, n);
        int maxSum = kadanesMax(arr, n);
        int circSum = totalSum - minSum;

        return maxSum > 0 ? Math.max(maxSum, circSum) : maxSum;
    }
    private static int kadanesMax(int[] nums, int n) {
        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    private static int kadanesMin(int[] nums, int n) {
        int sum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < n; i++) {
            sum = Math.min(sum + nums[i], nums[i]);
            minSum = Math.min(minSum, sum);
        }

        return minSum;
    }
}

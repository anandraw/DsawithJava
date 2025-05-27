package TwoPointerAlgo;

import java.util.Arrays;

public class DpMain {
    public static void main(String[] args) {
        LongestEvenLengthSubsequence solution = new LongestEvenLengthSubsequence();
        System.out.println(solution.longestEvenLengthSubsequence(new int[]{1, 2, 3}, 1)); // Output: 2
        System.out.println(solution.longestEvenLengthSubsequence(new int[]{25, 5, 25, 5}, 20)); // Output: 4
        System.out.println(solution.longestEvenLengthSubsequence(new int[]{11, 30, 29, 12, 4, 17, 8}, 3)); // Output: 2
    }
    public static class LongestEvenLengthSubsequence {

        public int longestEvenLengthSubsequence(int[] arr, int k) {
            Arrays  .sort(arr);
            int n = arr.length;
            int count = 0;
            int i = 0;

            while (i < n - 1) {
                if (Math.abs(arr[i] - arr[i + 1]) <= k) {
                    count += 2;  // valid pair
                    i += 2;      // skip next to ensure disjoint pairs
                } else {
                    i++;         // try next element
                }
            }

            return count;
        }


    }

}

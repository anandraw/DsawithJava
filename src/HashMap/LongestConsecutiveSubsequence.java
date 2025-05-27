package HashMap;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr={2, 6, 1, 9, 4, 5, 3};
        int ans=longestConsecutive(arr);
        System.out.println(ans);

    }
    public static int longestConsecutive(int[] arr) {
        arr = Arrays.stream(arr).distinct().sorted().toArray();

        int res = 1, cnt = 1;

        for (int i = 1; i < arr.length; i++) {

        //    if (arr[i] == arr[i - 1]) continue;  // skip duplicate

            // Check if the current element is equal
            // to previous element + 1
            if (arr[i] == arr[i - 1] + 1) { // just add one ane make diff
                cnt++;
            } else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}

package Array.easy;

import java.util.Arrays;
import java.util.HashMap;

public class CountPaisWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5}, target = 6;
        int ans = countPairs(arr,target);
        System.out.println(ans);
    }
    static int countPairs(int arr[], int target) {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

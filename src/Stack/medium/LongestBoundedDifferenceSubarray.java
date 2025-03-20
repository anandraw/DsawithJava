package Stack.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class LongestBoundedDifferenceSubarray {
    public static void main(String[] args) {
        int[] nums = {10,1,2,4,7,2}; int  limit = 5;
        //int result = longestSubarray(nums,limit);
        int result = longestSubarrayr(nums,limit);
        System.out.println(result);
        ArrayList<Integer> list = longestSubarray2(nums, limit);
        System.out.println(list);
    }

    // (using sliding window+heap)
    public static int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int maxLength=0;
        int i=0,j=0;

        // now define heap
        PriorityQueue<int[]> maxPq = new PriorityQueue<>((a, b) -> b[0] - a[0]); // max-heap
        PriorityQueue<int[]> minPq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // min-heap

        while (j<n){
            maxPq.offer(new int[]{nums[j],j});
            minPq.offer(new int[]{nums[j],j});

            while (maxPq.peek()[0] - minPq.peek()[0]>limit){// if diff is >limit
                i = Math.min(maxPq.peek()[1], minPq.peek()[1]) + 1;

                while (maxPq.peek()[1] < i) {
                    maxPq.poll();
                }
                while (minPq.peek()[1] < i) {
                    minPq.poll();
                }
            }
            // Update maxLength with the length of the current valid window
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }


       return maxLength;
    }

    ////Approach-2 (Using sliding window + multiset)
    ////T.C : O(nlogn)
    ////S.C : O(n)

    public static int longestSubarrayr(int[] nums, int limit) {
        int n = nums.length;

        TreeMap<Integer, Integer> st = new TreeMap<>();
        int i = 0;
        int j = 0;
        int maxLength = 0;

        while (j < n) {
            st.put(nums[j], st.getOrDefault(nums[j], 0) + 1);

            while (st.lastKey() - st.firstKey() > limit) {
                st.put(nums[i], st.get(nums[i]) - 1);
                if (st.get(nums[i]) == 0) {
                    st.remove(nums[i]);
                }
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }


    // another version of this pattern return subarray
    public static ArrayList<Integer> longestSubarray2(int[] arr, int x) {
        // code here
        int n = arr.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0, j = 0;
        int maxLength = 0;
        int start = 0, end = 0;

        while (j < n) {

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            while (map.lastKey() - map.firstKey() > x) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }

            // Update maximum length and store indices
            if (j - i + 1 > maxLength) {
                maxLength = j - i + 1;
                start = i;
                end = j;
            }

            j++;
        }

        // Extract the subarray
        ArrayList<Integer> result = new ArrayList<>();
        for (int k = start; k <= end; k++) {
            result.add(arr[k]);
        }
        return result;

    }
}

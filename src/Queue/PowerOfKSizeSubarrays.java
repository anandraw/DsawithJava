package Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PowerOfKSizeSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,2,5}; int k = 3;
        for (int i : resultsArray(nums, k)) {
            System.out.print(i+" ");
        }


    }
    // using deueue
    public static int[] resultsArray(int[] nums, int k) {
       int n = nums.length;

       int[] result = new int[n-k+1];
       Deque<Integer> queue = new LinkedList<>(); // Monotonic deque

        int i=0;

        for (int j = 0; j <n ; j++) {
            // conditons
            if (queue.size()==k){
                queue.pollFirst();
            }

            if (!queue.isEmpty() && queue.peekLast() != nums[j]-1){
                queue.clear();
            }
            queue.offer(nums[j]);

            if (j>=k-1){
                if (queue.size()==k){
                    result[i]= queue.peekLast();
                    i++;
                }else {
                    result[i]=-1;
                    i++;
                }
            }
        }
        return result;



    }
    public int[] resultsArrayAn(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int[] res = new int[nums.length - k + 1];
        Arrays.fill(res, -1);
        int ascendingCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                ascendingCount++;
                if (ascendingCount >= k) {
                    res[i + 1 - k] = nums[i];
                }
            } else {
                ascendingCount = 1;
            }
        }
        return res;
    }
}

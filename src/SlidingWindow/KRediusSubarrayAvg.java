package SlidingWindow;

import java.util.Arrays;

public class KRediusSubarrayAvg {
    public static void main(String[] args) {
       int[] nums = {8}; int k = 3;
        for (int average : getAverages(nums, k)) {
            System.out.print(average+" ");
        }

    }
    public static int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 2*k;
        int i =k ;
        int[] result = new int[n];
        long windowSum =0;
        Arrays.fill(result,-1);

        // for k==0;
        if (k==0){
            return nums;
        }

        // for n is less than k
        if(n<k){
            return result;
        }

        for (int j = left; j <= right; j++) {
              windowSum+=nums[j];
        }
        result[i] = (int) (windowSum/ (2*k+1));
        i++;
        right++;

        while (right<n){
            int oldEle = nums[left];
            int newEle = nums[right];
            windowSum = windowSum - oldEle+ newEle;
            result[i] = (int) (windowSum / (2 * k + 1));
            i++;
            right++;
            left++;
        }
        return result;
    }
}

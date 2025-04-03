package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3}; int k = 2;
        boolean ans = containsNearbyDuplicate(nums,k);
        System.out.println(ans);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0; int j=0;
        Set<Integer> set = new HashSet<>();

        while (j<nums.length){

            if (Math.abs(i-j)>k){
                set.remove(nums[i]);
                i++;
            }

            if (set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
            j++;
        }
        return false;
    }
}

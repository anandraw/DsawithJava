package DSAPattern.TwoPointer;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
       int[] arr = {-1,0,1,2,-1,-4};
       List<List<Integer>> list  = threeSum(arr);
        System.out.println(list);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;

        List<List<Integer>> result = new ArrayList<>();

        // bruteforce solution
//        HashSet<List<Integer>> set = new HashSet<>();
//
//        for (int i = 0; i <n-2 ; i++) {
//            for (int j = i+1; j <n-1 ; j++) {
//                for (int k = j+1; k <n; k++) {
//                      if (nums[i]+nums[j]+nums[k]==0){
//                          List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//                          Collections.sort(triplet);
//                          set.add(triplet);
//
//                      }
//                }
//            }
//        }
//        result.addAll(set);

         //optimal - O(n2)

        Arrays.sort(nums);   // step 1
        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicate left
                    while (left < right && nums[left] == nums[left + 1]) left++;

                    // skip duplicate right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}

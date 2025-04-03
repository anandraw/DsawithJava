package HashMap;

import java.util.HashMap;

//IMP : modulo concept is used
public class ContinuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3}; int k = 6;
        boolean result = checkSubarraySum(nums,k);
        System.out.println(result);
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;

        // frist corner case
         map.put(0,-1);  // exple {1,2,3} k=6

        for (int i = 0; i < n; i++) {
            sum+=nums[i];

            int rem = sum%k;
            if (rem<0){
                rem=+k;
            }
            if (map.containsKey(rem)){
                if (i-map.get(rem) >=2){
                    return  true;
                }
            }else{
                map.put(rem,i);
            }
        }
        return false;

    }
}

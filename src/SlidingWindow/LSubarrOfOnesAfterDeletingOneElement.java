package SlidingWindow;

//1493. Longest Subarray of 1's After Deleting One Element(must delete)
public class LSubarrOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};  //{1,1,1} o/p =2
        int ans = longestSubarray(nums);
        System.out.println(ans);
    }
    public  static int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int longestWindow = 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
                   if (nums[j] == 0){
                       zeroCount++;
                   }


            // Shrink the window until the zero counts come under the limit.
            while (zeroCount > 1) {
                if (nums[i] == 0){
                    zeroCount --;
                }
                i++;
            }

            longestWindow = Math.max(longestWindow, j - i);
        }

        return longestWindow;
    }

}




















//    public  static int longestSubarray(int[] nums) {
//        int maxLen =0;
//        int n = nums.length;
//
//        int countZeros =0;
//        for (int i = 0; i <n ; i++) {
//            if (nums[i]==0){
//                countZeros++;
//                maxLen = Math.max(maxLen, findMax(nums, i));
//            }
//        }
//        if (countZeros==0){
//            return n-1;
//        }
//        return maxLen;
//
//
//    }
//
//    private static int findMax(int[] nums, int skip_idx) {
//        int curLen =0;
//        int maxLen = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if (i==skip_idx){
//                continue;
//            }
//            if (nums[i]==1){
//                curLen++;
//                maxLen = Math.max(maxLen,curLen);
//            }else {
//                curLen=0;
//            }
//        }
//        return maxLen;
//    }


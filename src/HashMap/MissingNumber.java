package HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans  =missingNumber(nums);
        System.out.println(ans);
    }
    static public int missingNumber(int[] nums) {
        int n = nums.length;
        int  sum = n*(n+1)/2;
        int actualSum = 0;
        for (int i = 0; i <n ; i++) {
            actualSum += nums[i];
        }
        return sum-actualSum;
    }
}

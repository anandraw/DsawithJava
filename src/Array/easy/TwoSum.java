package Array.easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int[] arr  = {1, 4, 45, 6, 10, 8}; int target = 16;
        boolean ans = twoSum(arr,target);
        System.out.println(ans);
    }
    static boolean twoSum(int arr[], int target) {

//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 1; j <arr.length ; j++) {
//                if (arr[i]+arr[j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;
        Arrays.sort(arr);

        int left=0, right= arr.length-1;

        while (left<right){
            int sum = arr[left]+arr[right];

            if(sum==target) return true;
            else if(sum<target){
                left++;
            }else {
                right--;
            }
        }
        return false;
    }
}

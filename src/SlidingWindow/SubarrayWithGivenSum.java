package SlidingWindow;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        ArrayList<Integer> res = subarraySum(arr, target);

        for (int ele : res)
            System.out.print(ele + " ");
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        int start=0, end=0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        int currSum=0;
        for (int i = 0; i < n; i++) {
                 currSum+=arr[i];

                 if (currSum>=target) {
                     end = i;

                     while (currSum>target && start<end){
                         currSum-=arr[start];
                         ++start;
                     }


                     if (currSum == target) {
                         list.add(start + 1);
                         list.add(end + 1);
                         return list;
                     }
                 }
            }
        list.add(-1);
        return list;
    }
}

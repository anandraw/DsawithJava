package Array.easy;

import java.util.ArrayList;

public class IndexesofSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5}; int target = 12; //output [2,4] // slect only consucutive ans
        for (Integer i : subarraySum(arr, target)) {
            System.out.print("["+i+"]");
        }


    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // use sliding window
        ArrayList<Integer> result = new ArrayList<>();
        int sum=0; int i=0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while (sum > target && i < j) {
                sum -= arr[i];
                i++;
            }
            if (sum==target){
                result.add(i+1);
                result.add(j+1);
                break;
            }
            if (result.isEmpty()) {
                result.add(-1);
            }
            }

        return result;



        }
}

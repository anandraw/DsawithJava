package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateSubset {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        ArrayList<ArrayList<Integer>> subsets = printUniqueSubsets(nums);
        for (ArrayList<Integer> list:subsets){
            System.out.println(list);
        }
    }
     public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {

         Arrays.sort(nums); // in case arr={2,1,2}

         ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
         int start=0;
         int end=0;
         for (int i = 0; i < nums.length ; i++) {
             start=0;
             if (i>0 && nums[i]==nums[i-1]){
                 start=end+1;
             }
             end=outer.size()-1;
             int n = outer.size();
             for (int j = start; j <n ; j++) {
                 ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                 internal.add(nums[i]);
                 outer.add(internal);
             }
         }
         return outer;


    }
}

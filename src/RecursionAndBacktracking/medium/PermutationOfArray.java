package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        for (List<Integer> list : permute(nums)) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums,ans,new ArrayList<>());
        return ans;
    }

    private static void findPermutations(int[] nums, List<List<Integer>> ans, ArrayList<Integer> ds) {
        //base condition
        // if match the lengh then stop
        if (ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int num:nums){
            // skip if get same element
            if (ds.contains(num)){
                continue;
            }
            ds.add(num);
            findPermutations(nums,ans,ds);
            ds.remove(ds.size()-1); // backtrack
        }
    }
}

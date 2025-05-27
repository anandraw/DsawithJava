package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutaionOfArrayDuplicate {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        for (List<Integer> list : permuteUnique(nums)) {
            System.out.println(list);
        }
    }
    static public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  //vip when you work on dulicates
        boolean[] used = new boolean[nums.length]; // need to track which ele is used
        findPermutations(nums,ans,new ArrayList<>(),used);
        return ans;
    }

    private static void findPermutations(int[] nums, List<List<Integer>> ans, ArrayList<Integer> ds,boolean[] used) {

        if (ds.size()== nums.length && !ans.contains(ds)){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            ds.add(nums[i]);
            findPermutations(nums,ans,ds,used);
            used[i]=false;
            ds.remove(ds.size()-1);  // backtrack
        }
    }
}

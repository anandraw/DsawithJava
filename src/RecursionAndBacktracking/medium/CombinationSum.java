package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
       int[] candidates = {2}; int  target = 1;
        List<List<Integer>> lists = combinationSum(candidates, target);
        System.out.println(lists);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    private static void backTrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> ds, int start) {
        // Base condition: target is reached
        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                continue;
            }
            ds.add(candidates[i]);
            backTrack(candidates, target - candidates[i], result, ds, i);
            ds.remove(ds.size() - 1);
        }
    }
}

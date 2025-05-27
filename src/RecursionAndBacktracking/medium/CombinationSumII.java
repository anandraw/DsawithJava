package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int v[]={10,1,2,7,6,1,5};
        List < List < Integer >> comb = combinationSum2(v, 8);
        System.out.println(comb.toString().replace(",", " "));

    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    static void findCombinations(int start, int[] candidates, int target, List < List < Integer >> ans, List < Integer > ds) {
        // base condition
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            ds.add(candidates[i]);
            findCombinations(i + 1, candidates, target - candidates[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}

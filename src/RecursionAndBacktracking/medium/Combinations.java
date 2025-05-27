package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        int n=4,k=2;
        List<List<Integer>> combine = combine(n, k);
        for (List<Integer> num : combine){
            System.out.println(num+" ");
        }
    }
    static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n,1,k,new ArrayList<>(),result);
        return result;
    }

    private static void backtrack(int n, int start, int k,
                                  ArrayList<Integer> tmp, List<List<Integer>> result) {

        // base case
        if (tmp.size()==k){
            result.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = start; i <=n ; i++) {
            tmp.add(i);
            backtrack(n,i+1,k,tmp,result);
            tmp.remove(tmp.size()-1);  //backtrack
        }
    }
}

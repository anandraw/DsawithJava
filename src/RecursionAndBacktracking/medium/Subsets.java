package RecursionAndBacktracking.medium;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
       int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> subsets = subsets(nums);
        for (ArrayList<Integer> list:subsets){
            System.out.println(list);
        }

    }
    public static  ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }

}

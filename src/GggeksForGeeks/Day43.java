package GggeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class Day43 {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        List<List<Integer>> ans = findTriplets(arr);
        System.out.println(ans);

    }
    public static List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        ans.add(triplet);
                    }
                }
            }
        }
        return ans;
    }
}

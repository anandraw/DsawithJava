package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopinCandyStore {
    public static void main(String[] args) {
        int n = 4, k = 2, candies[] = {3 ,2 ,1, 4};
        ArrayList<Integer> list = candyStore(candies, n, k);
        System.out.println(list);
    }
    static ArrayList<Integer> candyStore(int candies[], int N, int K){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(candies);

        // For Minimum Cost
        int minCost = 0;
        int i = 0, j = N - 1;
        while (i <= j) {
            minCost += candies[i++];
            j -= K;
        }
        ans.add(minCost);

        // For Maximum Cost
        int maxCost = 0;
        i = N - 1;
        j = 0;
        while (i >= j) {
            maxCost += candies[i--];
            j += K;
        }
        ans.add(maxCost);

        return ans;
    }
}

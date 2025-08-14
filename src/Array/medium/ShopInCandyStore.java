package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopInCandyStore {
    public static void main(String[] args) {
        int prices[] = {3, 2, 1, 4}, k = 2;
        ArrayList<Integer> list = minMaxCandy(prices, k);
        System.out.println(list);
    }
    public static ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(prices);
        int n =prices.length;

        // first step to calculate min cost
        int minCost=0;
        int i=0;
        int j=n-1;
        while (i<=j){
             minCost+=prices[i];
             i++;
             j-=k; // skiping k candies
        }

        // next calculate max cost
        int maxCost=0;
        int x=0;
        int y=n-1;
        while (x <= y){
            maxCost +=  prices[y];
            x+=k;
            y--;
        }
        ans.add(minCost); ans.add(maxCost);
        return ans;
    }
}

package Array.medium;

import java.util.Arrays;

public class MinimumCostBuyCandies {
    public static void main(String[] args) {
     int[] arr ={8, 10, 1, 9, 1, 8, 6, 2};
     int ans = aliceWins(arr);
     System.out.println(ans);
    }
    public static int  aliceWins(int[] prices){
        Arrays.sort(prices); // Sort in ascending order
        int n = prices.length;
        int totalCost = 0;
        int i = n - 1; // Start from the most expensive candy

        while (i >= 0) {
            // Buy the most expensive candy first
            totalCost += prices[i];
            i--; // Move to the next candy

            int count = 1; // Track number of paid candies

            // Try to buy one more candy
            if (i >= 0) {
                totalCost += prices[i];
                count++;
                i--;
            }

            // Now get `count` free candies if possible
            while (count > 0 && i >= 0) {
                i--; // Skip the free candy
                count--;
            }
        }

        return totalCost;

    }
}

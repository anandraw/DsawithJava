package Greedy;

import java.util.Arrays;

//1833
public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] costs ={1,3,2,4,1}; int coins=7;
        int ans = maxIceCream(costs,coins);
        System.out.println(ans);
    }
    static int maxIceCream(int[] costs, int coins) {

        // first sort the array so we can buy min cost incecrems
        Arrays.sort(costs);
        int cnt=0;
        for (int cost :costs){
            if (cost > coins){
                return cnt;
            }else{
               coins-=cost;
               cnt++;
            }
        }
        return cnt;
    }
}

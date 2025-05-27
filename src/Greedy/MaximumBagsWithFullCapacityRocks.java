package Greedy;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityRocks {
    public static void main(String[] args) {
       int[] capacity = {2,3,4,5}, rocks = {1,2,4,4}; int additionalRocks = 2;
        int ans = maximumBags(capacity,rocks,additionalRocks);
        System.out.println(ans);
    }
    static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
          int n = capacity.length;
          int bagCnt=0;

          int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(diff);

        for (int i = 0; i <n ; i++) {
            if (additionalRocks >= diff[i]){
                additionalRocks-=diff[i];
                bagCnt++;
            }else{
                break;
            }
        }
        return bagCnt;
    }
}

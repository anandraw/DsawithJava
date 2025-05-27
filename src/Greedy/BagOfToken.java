package Greedy;

import java.util.Arrays;

public class BagOfToken {
    public static void main(String[] args) {
        int[]tokens = {100,200,300,400}; int  power = 200;
        int ans = bagOfTokensScore(tokens,power);
        System.out.println(ans);
    }
    public static int bagOfTokensScore(int[] tokens, int power) {
       int n = tokens.length;
       int maxScore=0;
       int i=0,j=n-1;

       Arrays.sort(tokens);
       int score = 0;
       while (i<=j){
          if (power>=tokens[i]){
              power-=tokens[i];
              score++;
              maxScore = Math.max(maxScore,score);
              i++;
          } else if (score>=1) {
              power+=tokens[j];
              score--;
              maxScore = Math.max(maxScore,score);
              j--;
          }else {
              return maxScore;
          }
       }
       return maxScore;
    }
}

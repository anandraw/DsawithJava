package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public  static ArrayList<Integer> largestSubset(int[] arr) {
        // code here
        Arrays.sort(arr);
        Integer[] dp = new Integer[arr.length];
        int maxi=0;
        for(int i=0; i<dp.length;i++){
            dp[i]=f(arr,i,dp);
            if(dp[i]>=dp[maxi]) maxi=i;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        backTrack(arr,dp,maxi,ans);
        return ans;
    }

    private static void backTrack(int[] arr, Integer[] dp, int i, ArrayList<Integer> ans ){
        ans.add(arr[i]);
        Integer maxi=null;
        for(int k=i+1;k<arr.length;k++){
            if(arr[k]%arr[i]==0){
                if(maxi==null){
                    maxi=k;
                }
                else if(dp[maxi]<=dp[k]){
                    maxi=k;
                }
            }
        }
        if(maxi!=null){
            backTrack(arr,dp,maxi,ans);
        }
    }
    private static int f(int[] arr,int i,Integer dp[]){
        if(dp[i]!=null) return dp[i];
        int ans=0;
        for(int k=i+1;k<arr.length;k++){
            if(arr[k]%arr[i]==0){
                ans=Math.max(ans,f(arr,k,dp));
            }
        }
        return dp[i]=1+ans;

    }

    public static void main(String[] args) {
        int arr[] = {1, 16, 7, 8, 4};
        ArrayList<Integer> list = largestSubset(arr);
        System.out.println(list);

    }
}

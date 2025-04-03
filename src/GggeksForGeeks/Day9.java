package GggeksForGeeks;

import java.util.Arrays;

//Minimize the Heights
public class Day9 {
    public static void main(String[] args) {
        int k = 7, arr[] = {1 ,8 ,10, 6, 4, 6, 9, 1};
        int minDiff = getMinDiff(arr, k);
        System.out.println(minDiff);
    }
     static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
         int min=0,max=0,r=0;
         Arrays.sort(arr);
         r=arr[n-1]-arr[0];

         for (int i = 1; i <n ; i++) {
             if (arr[i]>=k){
                 max=Math.max(arr[i-1]+k,arr[n-1]-k);
                 min=Math.min(arr[i]-k,arr[0]+k);
                 r=Math.min(r,max-min);
             }else {
                 continue;
             }
         }
         return r;
    }
}

package SlidingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr={7 ,14 ,17 ,18 ,5 ,9 ,20 ,14 ,19 ,7 ,16 ,11 ,7 ,11 ,10 ,10 ,15, 6, 14};
        int ans=totalEle(arr);
        System.out.println(ans);
    }

    public static int totalEle(int[]arr){
        if (arr == null || arr.length == 0) return 0;

        int n =arr.length;
        int i=0;
        int maxLen=0;
        HashMap<Integer,Integer>map=new LinkedHashMap<>();
        for (int j = 0; j <n ; j++) {
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);

            while (map.size()>2){
               int leftVal=arr[i];
               int cnt=map.get(leftVal)-1;
               if (cnt == 0) {
                    map.remove(leftVal);
                } else {
                    map.put(leftVal, cnt);
                }
                i++;
            }
            maxLen= Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }

}

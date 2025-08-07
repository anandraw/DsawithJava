package SlidingWindow;

import java.util.HashMap;

public class SubarrWithAtMostKDistinctInT {
    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        int k=2;
        int ans =countAtMostK(arr,k);
        System.out.println(ans);
    }
    public static int countAtMostK(int arr[], int k) {

        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0,j=0;
        int ans=0;
        int n=arr.length;
        while (j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            while (i<=j&&map.size()>k){
                map.put(arr[i],map.get(arr[i])-1);
                if (map.get(arr[i])==0)map.remove(arr[i]);
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}

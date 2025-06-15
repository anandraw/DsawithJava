package BinarySearch;

import java.util.TreeSet;

public class FloorInSortdArray {
    public static void main(String[] args) {
        int  arr[] = {1, 2, 8, 10, 11, 12, 19}, k = 5;

        TreeSet<Integer> ts = new TreeSet<>();
        for (int ar:arr){
            ts.add(ar);
        }
        System.out.println(ts.ceiling(k));

        int ans = findFloor(arr,k);
        System.out.println(ans);
    }
     public static  int findFloor(int[] arr, int k) {
         int low = 0;
         int high = arr.length - 1;
         int ans = -1;   // If an element does not exist, return -1.

         while(low <= high){
             int mid = low + (high - low) / 2;  // find the middle index of an arr[]

             if(arr[mid] <= k){
                 ans = mid;   // may be answer
                 low = mid + 1;   // check first her for better answer
             } else high = mid - 1;  // for arr[mid] > k
         }
         return ans;
     }
}

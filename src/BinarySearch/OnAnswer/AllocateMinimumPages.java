package BinarySearch.OnAnswer;

import java.util.Arrays;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int [] arr={12, 34, 67, 90};
        int k=2;  // student
        int pages = findPages(arr, k);
        System.out.println(pages);
    }

    public static int findPages(int[] arr, int k) {
         int n = arr.length;
          if(k>n) return -1;

         int min = Arrays.stream(arr).max().getAsInt(); // min pages
         int max = Arrays.stream(arr).sum(); //max pages
         int ans =0;

         while (min<=max){
             int mid= min+(max-min)/2;

             if(isAllocationPaossible(arr,mid,k)){
                 ans=mid;
                 max=mid-1;
             }else{
                 min=mid+1;
             }
         }
         return ans;

    }

    private static boolean isAllocationPaossible(int[] arr, int limit, int k) {
        int noOfStundet=1;
        int pagesAllowed=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]+pagesAllowed<=limit){
                pagesAllowed+=arr[i];
            }else{
                noOfStundet++;
                pagesAllowed=arr[i];
                if(pagesAllowed>limit)return false;
            }
        }
        return noOfStundet<=k;
    }
}

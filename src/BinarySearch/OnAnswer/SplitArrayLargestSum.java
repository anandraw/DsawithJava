package BinarySearch.OnAnswer;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
         int[] arr={1,2,3,4};int k=3;
         int ans = splitArray(arr,k);
        System.out.println(ans);
    }
    public static int splitArray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            max = Math.max(max, arr[i]);
        }

        int ans = sum;

        int high = sum;  // if k=0, then the maximized minimum sum = sum of array
        int low = max;  // minimum sum will be maximum element of the array.



// Applying Binary Search
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(arr, k, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int k, int mid){
        int count = 1;
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum>mid){
                sum = arr[i];
                count++;
            }
        }
        if(count<=k){
            return true;
        }
        return false;
    }
}

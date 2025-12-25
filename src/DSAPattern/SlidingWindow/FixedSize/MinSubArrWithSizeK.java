package DSAPattern.SlidingWindow.FixedSize;

public class MinSubArrWithSizeK {
    public static void main(String[] args) {
      int[] arr={2,5,7,8,2,9,1}; int k=3;
        int ans = maxArr(arr,k);
        System.out.println(ans);
    }
    public  static int maxArr(int[] arr, int k){
         int start=0 ; int end=0; int windowSum=0; int ans=Integer.MAX_VALUE;
         int n = arr.length;
         while (end<n){

             windowSum+=arr[end];

             if (end-start+1==k){
                 ans=Math.min(windowSum,ans);
                 windowSum-=arr[start];
                 start++;
             }
             end++;
         }
         return ans;
    }
}

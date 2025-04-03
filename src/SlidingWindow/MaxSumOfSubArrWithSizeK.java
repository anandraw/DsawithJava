package SlidingWindow;

public class MaxSumOfSubArrWithSizeK {
    public static void main(String[] args) {
        int[] arr = {100 ,200 ,300, 400};int k=2;
        int maxSum = findMaxSum(arr, k);
        System.out.println(maxSum);


    }
    public static int findMaxSum(int[] arr,int k){
        int maxSum= Integer.MIN_VALUE;
        int windowSum=0;
        int i=0;
        int j=0;

        while (j < arr.length) {
            windowSum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } else {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}

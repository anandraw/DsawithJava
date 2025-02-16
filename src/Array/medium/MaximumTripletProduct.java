package Array.medium;

import java.util.Arrays;

public class MaximumTripletProduct {
    public static void main(String[] args) {
        int[] arr = {-10, -1, 5, 2};
        int n = arr.length;
        int maxProduct = maxTripletProduct(arr, n);
        System.out.print("The maximum triplet product is: " + maxProduct);

    }

     static int maxTripletProduct(int arr[], int n) {
         Arrays.sort(arr);
         int product1 = arr[n-1] * arr[n-2] * arr[n-3]; // last 3 element
         int product2 = arr[0]*arr[1]*arr[n-1];
         int max = Math.max(product1,product2);
        return max;
    }
}

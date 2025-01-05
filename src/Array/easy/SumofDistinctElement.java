package Array.easy;

import java.util.Arrays;

public class SumofDistinctElement {
    public static void main(String[] args) {
        int[] arr={5,5,5,5};
        int r =findSum(arr);
        System.out.println(r);

    }

    static int findSum(int arr[]) {
        // code here
        int n = arr.length;
        int result =Arrays.stream(arr).distinct().sum();
        return result;

    }
}

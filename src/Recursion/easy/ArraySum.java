package Recursion.easy;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findSum(arr, arr.length));
    }
    static int findSum(int A[], int N)
    {
        Arrays.stream(A).sorted();
        if (N <= 0)
            return 0;
        return (findSum(A, N - 1) + A[N - 1]);
    }

}

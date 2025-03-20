package Recursion.easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubbleSort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int end, int start){
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            bubbleSort(arr, end, start + 1);
        } else {
            bubbleSort(arr, end - 1, 0);
        }
    }
}

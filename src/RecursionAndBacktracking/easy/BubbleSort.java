package RecursionAndBacktracking.easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int start, int end){
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            bubbleSort(arr, start+1,end);
        } else {
            bubbleSort(arr, 0, end-1);
        }
    }

}


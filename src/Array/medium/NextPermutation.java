package Array.medium;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }

    }
     static  void nextPermutation(int[] arr) {
         int n = arr.length;
         int i = n - 2;

         // Step 1: Find the first decreasing element from the right
         while (i >= 0 && arr[i] >= arr[i + 1]) {
             i--;
         }

         if (i >= 0) {
             // Step 2: Find the next larger element from the right
             int index = n - 1;
             while (arr[index] <= arr[i]) {
                 index--;
             }
             // Swap the elements
             swap(arr, i, index);
         }

         // Step 3: Reverse the subarray from i+1 to end
         reverse(arr, i + 1, n - 1);
     }

    // Swap helper method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse helper method
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

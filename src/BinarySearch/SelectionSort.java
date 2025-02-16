package BinarySearch;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={4,1,3,9,7};
        selectionSort(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }

    }
     static void selectionSort(int[] arr) {

         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             int mini = i;
             for (int j = i; j < n; j++) {
                 if (arr[mini] > arr[j]) {
                     mini = j;
                 }
             }
             int temp = arr[mini];
             arr[mini] = arr[i];
             arr[i] = temp;
         }
     }
}

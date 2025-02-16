package BinarySearch;

public class BubleSort {
    public static void main(String[] args) {
       int[] arr ={6,3,4,7,8,2};
       bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++)     {
            boolean swapped = false;

            // Perform the pass, comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

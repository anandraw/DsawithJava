package GggeksForGeeks;

public class Day2 {
    public static void main(String[] args) {
         int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
         pushZerosToEnd(arr);
         for (int num:arr){
             System.out.print(num+" ");
         }

    }
    static void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int nonZeroIndex = 0; // Pointer for non-zero elements

        // Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the rest of the array with zeros
        while (nonZeroIndex < n) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

    }
}

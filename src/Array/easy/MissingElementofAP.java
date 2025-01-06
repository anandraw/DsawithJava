package Array.easy;

public class MissingElementofAP {
    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12, 14};
        int result = findMissing(arr);
        System.out.println(result);

    }

   static int findMissing(int[] arr) {
       int n = arr.length;
       // Calculate the common difference of the AP
       int cd = (arr[n - 1] - arr[0]) / n;

       // Traverse the array and find the missing element
       for (int i = 1; i < n; i++) {
           if (arr[i] != arr[i - 1] + cd) {
               return arr[i - 1] + cd;
           }
       }

       // If no missing element is found
       return -1; // Return -1 as a default value
    }
}

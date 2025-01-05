package Array.easy;

public class LeftRoate {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int d = 3;
        leftRotate(arr,d);
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
    static void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        if (n==0) return;

        d = d % n;

      //  int[] tmp = new int[d];
//
//        // tmp aray mai copy kiya maine
//        for (int i = 0; i < d; i++) {
//            tmp[i]=arr[i];
//        }
//
//        for (int i = d; i < n; i++) {
//            arr[i-d]=arr[i];
//        }
//
//        for (int i = 0; i < d; i++) {
//            arr[n - d + i] = tmp[i];
//        }

        //using reversal algorithm
        reverse(arr,0,d-1); // first reverse d elemnt output: 2 1 3
        reverse(arr,d,n-1); // reverse remaing element : 2 1 3
        reverse(arr,0,n-1); //reverse entire aeear : 3,1,2







    }
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

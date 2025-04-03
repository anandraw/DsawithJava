package SlidingWindow;

public class Smallestsubarraywithsumgreaterthanx {
    public static void main(String[] args) {
        int x = 100; int arr[] = {1, 10, 5, 2, 7};
        int rresult=smallestSubWithSum(x,arr);
        System.out.println(rresult);
    }
    public static int smallestSubWithSum(int x, int[] arr) {
        int i = 0, j = 0;
        int minL = Integer.MAX_VALUE; // Initialize to a large value
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j];

            while (sum > x) {
                minL = Math.min(minL, j - i + 1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        if (minL > arr.length) {
            return 0;
        }
        return minL;
    }
}

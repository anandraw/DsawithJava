package Array.easy;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr ={1,2,4,3};
        int r = peakElemen(arr);
        System.out.println(r);
    }

    public static int peakElemen(int[] arr) {

        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) {
                return i;
            }

        }
        return -1;
    }
}

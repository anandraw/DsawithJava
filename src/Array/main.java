package Array;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("jai sharee ram!");
        int[] arr = {1,2,3,4,5,6};
          printData(arr);
        int target=10;
        int[] result = printApit(arr, target);
        System.out.println(Arrays.toString(result));
        int[] pairTwoPointer = findPairTwoPointer(arr, target);
        System.out.println(Arrays.toString(pairTwoPointer));

    }
    static int[] printApit(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    static int[] findPairTwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    static void printData(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 3) {
            if (i < n) {
                System.out.print(arr[i] + " ");
            }
            if (i + 1 < n) {
                System.out.print(arr[i + 1] + " ");
            }
            if (i + 2 < n) {
                System.out.print(arr[i + 2]);
            }
            System.out.println();
        }
    }
}

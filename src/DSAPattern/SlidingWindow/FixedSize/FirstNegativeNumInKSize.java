package DSAPattern.SlidingWindow.FixedSize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumInKSize {
    public static void main(String[] args) {
       int arr[] = {12, -1, -7, 8, -15, 30, 16, 28}; int k=3;
        ArrayList<Integer> ans = firstNegetive(arr,k);
        System.out.println(ans);
    }

    public static ArrayList<Integer> firstNegetive(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int start = 0;
        int end = 0;

        while (end < arr.length) {

            if (arr[end] < 0) {
                queue.add(arr[end]);
            }

            if (end - start + 1 < k) {
                end++;
            }

            else if (end - start + 1 == k) {

                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                }

                if (!queue.isEmpty() && arr[start] == queue.peek()) {
                    queue.poll();
                }
                start++;
                end++;
            }
        }
        return result;
    }
}

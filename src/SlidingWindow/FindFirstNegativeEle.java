package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindFirstNegativeEle {
    public static void main(String[] args) {
        int[] arr={8,-2,-3,4,5}; int k=2;
        List<Integer> firstNegative = findFirstNegative(arr, k);
        System.out.println(firstNegative);
    }
    public static List<Integer> findFirstNegative(int[] arr, int k){
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i=0;
        int j=0;

        while (j<arr.length){
            if (arr[j]<0){
                queue.add(arr[j]);
            }
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                if (!queue.isEmpty()) {
                    ans.add(queue.peek());
                } else {
                    ans.add(0);
                }
                if (!queue.isEmpty() && queue.peek()==arr[i]){
                    queue.poll();
                }
                i++;
                j++;
            }
        }
        return ans;

    }
}

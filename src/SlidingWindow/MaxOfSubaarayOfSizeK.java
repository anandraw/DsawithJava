package SlidingWindow;

import java.util.*;

public class MaxOfSubaarayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7}; // Expected Output: [3, 3, 5, 5, 6, 7]
        int k = 3;
        System.out.println(slidingMaximum(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7), k));
    }
    public static ArrayList<Integer> slidingMaximum(List<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]); // Max Heap
        int i = 0, j = 0;

        while (j < arr.size()) {

            maxHeap.add(new int[]{arr.get(j), j});

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                while (!maxHeap.isEmpty() && maxHeap.peek()[1] < i) {
                    maxHeap.poll();
                }
                result.add(maxHeap.peek()[0]);

                i++;
                j++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> slidingMaxi(List<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>(); // Sorted Map

        int i = 0, j = 0;

        while (j < arr.size()) {
            // Add current element to TreeMap
            map.put(arr.get(j), map.getOrDefault(arr.get(j), 0) + 1);

            // If window size is not yet reached, move right
            if (j - i + 1 < k) {
                j++;
            } else {
                // The last key in TreeMap is the maximum in the current window
                result.add(map.lastKey());

                // Remove the leftmost element (arr[i]) from TreeMap
                if (map.get(arr.get(i)) == 1) {
                    map.remove(arr.get(i)); // Remove completely if frequency is 1
                } else {
                    map.put(arr.get(i), map.get(arr.get(i)) - 1); // Decrease frequency
                }

                // Slide window
                i++;
                j++;
            }
        }
        return result;
    }
}

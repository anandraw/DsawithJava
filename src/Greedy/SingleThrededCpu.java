package Greedy;

import java.util.Arrays;
import java.util.PriorityQueue;


public class SingleThrededCpu {
    public static void main(String[] args) {
       int[][]  tasks = {{1,2},{2,4},{3,2},{4,1}};
        int[] order = getOrder(tasks);
        System.out.println(Arrays.toString(order));
    }
    public static int[] getOrder(int[][] tasks) {

        int n = tasks.length;
        int[][] indexedTasks = new int[n][3]; // {enqueueTime, processingTime, originalIndex}

        for (int i = 0; i < n; i++) {
            indexedTasks[i][0] = tasks[i][0];
            indexedTasks[i][1] = tasks[i][1];
            indexedTasks[i][2] = i;
        }

        // Sort by enqueueTime
        Arrays.sort(indexedTasks, (a, b) -> Integer.compare(a[0], b[0]));

        // Min-heap: sort by processingTime, then by index
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2])
        );

        int time = 0, index = 0, resIndex = 0;
        int[] result = new int[n];

        while (resIndex < n) {
            // Add all available tasks to the priority queue
            while (index < n && indexedTasks[index][0] <= time) {
                pq.offer(indexedTasks[index]);
                index++;
            }

            if (pq.isEmpty()) {
                time = indexedTasks[index][0]; // Move time forward if no task is available
            } else {
                int[] task = pq.poll();
                time += task[1]; // Add processing time
                result[resIndex++] = task[2]; // Add original index to result
            }
        }

        return result;

    }
}

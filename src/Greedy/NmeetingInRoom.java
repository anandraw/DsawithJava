package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NmeetingInRoom {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end =   {2, 4, 6, 7, 9, 9};

        System.out.println("Max meetings: " + maxMeetings(start, end));

    }
    public static int maxMeetings(int start[], int end[]) {
        int n = start.length;

        // Step 1: Create array of meeting indices
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: Sort indices based on end times
        Arrays.sort(indices, Comparator.comparingInt(i -> end[i]));

        // Step 3: Select meetings using greedy approach
        int count = 1;
        int lastEnd = end[indices[0]];

        for (int i = 1; i < n; i++) {
            if (start[indices[i]] > lastEnd) {
                count++;
                lastEnd = end[indices[i]];
            }
        }

        return count;
    }
}

package GggeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day24 {
    public static void main(String[] args) {
        int arr[][] ={{1,3},{2,4},{6,8},{9,10}};
        for (int[] ints : mergeOverlap(arr)) {
            for (int i = 0; i < ints.length ; i++) {
                System.out.println(ints[i]);
            }
        }


    }
    public static List<int[]> mergeOverlap(int[][] arr) {

        // Sort intervals based on start values
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        res.add(new int[]{arr[0][0], arr[0][1]});

        for (int i = 1; i < arr.length; i++) {
            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];

            // If current interval overlaps with the last merged
            // interval, merge them
            if (curr[0] <= last[1])
                last[1] = Math.max(last[1], curr[1]);
            else
                res.add(new int[]{curr[0], curr[1]});
        }

        return res;
    }
}

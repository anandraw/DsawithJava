package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencingProblem {
    public static void main(String[] args) {
       int deadline[] = {4, 1, 1, 1}, profit[] = {20, 10, 40, 30};
        ArrayList<Integer> list = jobSequencing(deadline, profit);
        System.out.println(list);
    }
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {

        int n = deadline.length;
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Job(deadline[i], profit[i]);
        }

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxJobDeadline = 0;
        for (Job a : arr) {
            maxJobDeadline = Math.max(maxJobDeadline, a.deadline);
        }

        int[] fillTime = new int[maxJobDeadline];
        Arrays.fill(fillTime, -1);

        int profits = 0, jobsDone = 0;
        for (Job a : arr) {
            for (int i = a.deadline - 1; i >= 0; i--) {
                if (fillTime[i] == -1) {
                    fillTime[i] = i;
                    profits += a.profit;
                    jobsDone++;
                    break;
                }
            }
        }

        return new ArrayList<>(Arrays.asList(jobsDone, profits));
    }

   static class Job {
        int deadline, profit;
        Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }
}

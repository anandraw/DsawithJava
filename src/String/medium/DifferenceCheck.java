package String.medium;

import java.util.Arrays;

public class DifferenceCheck {
    public static void main(String[] args) {
       String arr[] = {"12:30:15", "12:30:45"};
       int ans=minDifference(arr);
       System.out.println(ans);

    }
    static int minDifference(String[] arr) {
        int n=arr.length;
        int[] seconds=new int[n];

        // first convert the min ti sec
        for(int i=0; i<n; i++){

            //first need to split the arry
            String[] parts=arr[i].split(":");
            int hours=Integer.parseInt(parts[0]);
            int min=Integer.parseInt(parts[1]);
            int sec=Integer.parseInt(parts[2]);

            // now calculate total seconds
            seconds[i]=hours*3600+min*60+sec;

        }
        // sort the into acending
        Arrays.sort(seconds);

        // calculate the min diff
        int minDiff=Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            minDiff=Math.min(minDiff,seconds[i]-seconds[i-1]);
        }
        int circularDiff = (86400 - seconds[n - 1]) + seconds[0];
        // 86400 = total seconds in a day
        minDiff = Math.min(minDiff, circularDiff);

        return minDiff;
    }
}

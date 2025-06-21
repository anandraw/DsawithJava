package Greedy;

import java.util.LinkedList;
import java.util.Queue;

public class PoliceandThieves {
    public static void main(String[] args) {
        char[] arr={'T', 'T', 'P', 'P', 'T', 'P'}; int k=2;
        int ans = catchThieves(arr,k);
        System.out.println(ans);

    }
    public static int catchThieves(char[] arr, int k) {
        Queue<Integer> police = new LinkedList<>();
        Queue<Integer> thief = new LinkedList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]=='T'){
                thief.add(i);
            }else{
                police.add(i);
            }
        }

        int cnt=0;
        while (!police.isEmpty() && ! thief.isEmpty()){
            if (Math.abs( police.peek()-thief.peek())<=k){
                police.remove();
                thief.remove();
                cnt++;
            }
            else if(police.peek()>thief.peek()){
                thief.remove();
            }else {
               police.remove();
            }
        }
        return cnt;


        // int n = arr.length;
        //        int i = 0, j = 0; // i for police, j for thief
        //        int count = 0;
        //
        //        while (i < n && j < n) {
        //            // Move i to next police
        //            while (i < n && arr[i] != 'P') i++;
        //            // Move j to next thief
        //            while (j < n && arr[j] != 'T') j++;
        //
        //            // Base check
        //            if (i < n && j < n) {
        //                if (Math.abs(i - j) <= k) {
        //                    count++;
        //                    i++;
        //                    j++;
        //                } else if (j < i) {
        //                    j++;
        //                } else {
        //                    i++;
        //                }
        //            }
        //        }
        //
        //        return count;
    }
}

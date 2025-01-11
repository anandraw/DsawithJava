package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


// sort 0s,1s,2s
public class DutchNationalFlagAlgo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{1,2,0,0,2,1,2}));
        int n = arr.size();
        sortArray(arr,n);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(STR."\{arr.get(i)} ");
        }
    }

    static  void sortArray(ArrayList<Integer>arr, int n ) {
//        Collections.sort(arr);
//        Collections.reverse(arr);
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                int tmp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, tmp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                int tmp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, tmp);
                high--;
            }
        }
    }
}

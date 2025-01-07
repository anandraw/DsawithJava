package Array.easy;

import java.util.ArrayList;

public class NextGretherElement {
    public static void main(String[] args) {
        int  arr[] = {16, 17, 4, 3, 5, 2};
        for (Integer i : nextGreatest(arr)) {
            System.out.print(i+" ");
        }


    }
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int rightMost = -1;
        for(int i=arr.length-1; i>=0; i--) {
            result.add(0, rightMost);
            rightMost = Math.max(rightMost, arr[i]);
        }
        return result;

    }
}

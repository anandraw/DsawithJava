package GggeksForGeeks.Ocnntest;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayGeme255 {
    public static void main(String[] args) {
       int[] arr ={2,1,1,2};
        boolean b = arryGame(arr);
        System.out.println(b);
    }
    public static boolean arryGame(int[] arr){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int aliceScore = 0, bobScore = 0;

        while (left < right) {
            aliceScore += arr[right--];
            bobScore   += arr[left++];
        }
        if (left == right) {
            aliceScore += arr[left];
        }
        System.out.println("Alice = " + aliceScore);
        System.out.println("Bob   = " + bobScore);
        return aliceScore > bobScore;
    }
}

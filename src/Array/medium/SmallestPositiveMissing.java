package Array.medium;

import java.util.Arrays;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
       int arr[] = {2, -3, 4, 1, 1, 7};
        int i = missingNumber(arr);
        System.out.println(i);
    }
    public static  int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int s = 1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                continue;
            }
            if(arr[i]>0){
                if(arr[i] == s){
                    s = s+1;
                    continue;
                }
            }
        }
        return s;
    }
}

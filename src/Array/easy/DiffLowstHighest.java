package Array.easy;

import java.util.HashMap;

public class DiffLowstHighest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2};
        int result = findDiff(arr);
        System.out.println(result);

    }

    static int findDiff(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int minValue = Integer.MAX_VALUE;
        int maxVakue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int value: map.values()){
            if (maxVakue<value){
                maxVakue=value;
            }
            if (minValue>value){
                minValue=value;
            }
        }
        return maxVakue-minValue;
    }

}

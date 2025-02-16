package Array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {
    public static void main(String[] args) {
       int arr[] = {1, 3, 3};
        for (Integer i : findTwoElement(arr)) {
            System.out.print(i+" ");
        }

    }
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int missing = 0, repeating = 0;
        // Identify the repeating and missing numbers
        for (int i = 1; i <= arr.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    repeating = i;
                }
            } else {
                missing = i;
            }
        }

        // Add results to the list
        list.add(repeating);
        list.add(missing);
        return list;
    }

}

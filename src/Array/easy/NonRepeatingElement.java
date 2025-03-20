package Array.easy;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
       int[] arr = {-1, 2, -1, 3, 2};//
        int ans = firstNonRepeating(arr);
        System.out.println(ans);
    }
    public static int firstNonRepeating(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}

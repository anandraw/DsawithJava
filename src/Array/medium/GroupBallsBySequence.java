package Array.medium;


import java.util.TreeMap;

public class GroupBallsBySequence {
    public static void main(String[] args) {
        int[] arr = {1,2,10,11};
        int k = 2;
        boolean ans = validgroup(arr, k);
        System.out.println(ans);
    }
    public  static boolean validgroup(int[] arr, int k) {

        if (arr.length % k != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while (!map.isEmpty()) {
            int first = map.firstKey(); // Smallest available number
            for (int i = 0; i < k; i++) {
                int current = first + i;
                if (!map.containsKey(current)) {
                    return false;
                }
                map.put(current, map.get(current) - 1);
                if (map.get(current) == 0) {
                    map.remove(current);
                }
            }
        }
        return true;
    }
}

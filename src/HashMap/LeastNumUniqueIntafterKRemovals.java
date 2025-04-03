package HashMap;

import java.util.*;

// leetcode 1481
public class LeastNumUniqueIntafterKRemovals {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2}; int k = 3;
        int ans =findLeastNumOfUniqueIntss(arr,k);
        System.out.println(ans);
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        // store all frequencies
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        // bcz need to delete first lowest frequency
        List<Integer> freq = new ArrayList<>(); // use min heap
        for (Map.Entry<Integer, Integer> entry :map.entrySet()){
            freq.add(entry.getValue());
        }
        Collections.sort(freq);


        for (int i = 0; i < freq.size(); i++) {
            k -= freq.get(i);

            if (k < 0) {
                return freq.size() - i;
            }
        }

        return 0;
    }

    // using min heap
    public static int findLeastNumOfUniqueIntss(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(map.values());

        int elementsRemoved = 0;

        while (!queue.isEmpty()){
            elementsRemoved+=queue.peek();

            if (elementsRemoved>k){
                return queue.size();
            }
            queue.poll();
        }
        return 0;
    }
}

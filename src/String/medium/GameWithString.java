package String.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class GameWithString {
    public static void main(String[] args) {
        String s = "abbccc"; int k = 2;
        int ans = minValue(s,k);
        System.out.println(ans);
    }
    public static int minValue(String s, int k) {

        HashMap<Character,Integer> freq=new HashMap<>();
        for (char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());

        for (char ch: freq.keySet()){
            queue.offer(freq.get(ch));
        }
        System.out.println(queue);
        while (k>0){
            int newVal=queue.poll()-1;
            queue.offer(newVal);
            k--;
        }
        System.out.println(queue);
        int prodct=0;
        while (!queue.isEmpty()){
            int val= queue.poll();
            prodct=prodct+val*val;
        }
        return prodct;
    }
}

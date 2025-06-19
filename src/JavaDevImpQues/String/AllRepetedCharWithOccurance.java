package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.Map;

public class AllRepetedCharWithOccurance {
    public static void main(String[] args) {
        String s ="Programming";

        // methode 1
        Map<Character,Integer> map = new HashMap<>();
        for (char ch:s.toLowerCase().toCharArray()){
            Integer cnt = map.getOrDefault(ch, 0);
            map.put(ch,cnt+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>1){
                System.out.println("repeated character are : " + entry.getKey() + " count is "+entry.getValue());
            }
        }

        // methode 2
        s=s.toLowerCase();
        int[] cnt = new int[256];

        for (char ch : s.toCharArray()){
            cnt[ch]++;
        }

        for (char ch : s.toCharArray()){
            if (cnt[ch]>1){
                System.out.println("first repeating char : "+ ch +" cnt is :" + cnt[ch]);
            }
        }

    }
}

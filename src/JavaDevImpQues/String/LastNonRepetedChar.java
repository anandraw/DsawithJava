package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.Map;

public class LastNonRepetedChar {
    public static void main(String[] args) {
        String str = "aabcbddex";

        Map<Character,Integer> map = new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Character last = null;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue() == 1) {
                last = entry.getKey();
            }
        }
        System.out.println(last);
    }
}

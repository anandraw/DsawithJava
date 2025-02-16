package String.easy;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {
    public static void main(String[] args) {
       String s = "output";
       char c =getMaxOccuringChar(s);
        System.out.println(c);

    }
    public static char getMaxOccuringChar(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int maxFrequency=Integer.MIN_VALUE;
        char maxChar = '\0';

        char[] ch=s.toCharArray();
        for (char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int frequency=entry.getValue();
            char currChar=entry.getKey();

            if(maxFrequency<frequency || (maxFrequency==currChar && currChar<maxChar))
            {
                maxChar=currChar;
                maxFrequency=frequency;
            }

        }
        return maxChar;


    }
}

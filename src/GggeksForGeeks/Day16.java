package GggeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day16 {
    public static void main(String[] args) {
       String s1 = "geeks", s2 = "kseeg";
       boolean ans = areAnagrams(s1,s2);
        System.out.println(ans);
    }
    public static boolean areAnagrams(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();

        for (char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch : s2.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        for(var pair:map.entrySet()){
            if (pair.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}

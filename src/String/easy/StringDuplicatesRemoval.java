package String.easy;

import java.util.*;

public class StringDuplicatesRemoval {
    public static void main(String[] args) {
        String  s = "geEksforGEeks";
        String s1 = removeDuplicates(s);
        System.out.println(s1);
    }
    static String removeDuplicates(String s){
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}

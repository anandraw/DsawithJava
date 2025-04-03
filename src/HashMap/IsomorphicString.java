package HashMap;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {

    }
    static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false; // Different lengths can't be isomorphic

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // Check if mapping already exists and is correct
            if (mapST.containsKey(ch1) && mapST.get(ch1) != ch2) return false;
            if (mapTS.containsKey(ch2) && mapTS.get(ch2) != ch1) return false;

            // Create the mapping
            mapST.put(ch1, ch2);
            mapTS.put(ch2, ch1);
        }
        return true;
    }
}

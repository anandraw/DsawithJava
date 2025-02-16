package String.easy;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s1 ="abaab"; String s2="xyxxy";
        boolean b = areIsomorphic(s1, s2);
        System.out.println(b);
    }

    public static boolean areIsomorphic(String s1, String s2) {
        //check length if it is not same then not possible
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2) {
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (mapTS.containsKey(c1) && mapTS.get(c1) != c2) {
                return false;
            }
            if (mapST.containsKey(c2) && mapST.get(c2) != c1) {
                return false;
            }

            mapTS.put(c1, c2);
            mapST.put(c2, c1);

        }
        return true;
    }
}

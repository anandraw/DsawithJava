package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0;
        int n = s.length();

        while (j < n) {
            char ch = s.charAt(j);

            while (set.contains(ch)) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength, j - i + 1);

            j++;
        }

        return maxLength;
    }
}

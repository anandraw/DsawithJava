package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstringOptimize(s);
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

    public static int lengthOfLongestSubstringOptimize(String s) {
        Set<Character> set = new HashSet<>();
        int maxlen = 0;
        int start=0;

        for (int end = 0; end <s.length() ; end++) {
            while (set.contains(s.charAt(end))){
                set.remove(s.charAt(end));
                start++;
            }
            set.add(s.charAt(end));
            maxlen = Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}

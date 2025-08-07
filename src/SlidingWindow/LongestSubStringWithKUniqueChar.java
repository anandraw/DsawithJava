package SlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithKUniqueChar {
    public static void main(String[] args) {
        String s = "aabacbebebe"; int k = 3;
        int ans=longestKSubstr(s,k);
        System.out.println(ans);
    }
    public static int longestKSubstr(String s, int k) {
        int n = s.length();
        int i = 0, j = 0;
        int maxLen = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < n) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }

        return maxLen;
    }

}

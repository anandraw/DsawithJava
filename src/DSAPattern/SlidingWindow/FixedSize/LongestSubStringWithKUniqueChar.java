package DSAPattern.SlidingWindow.FixedSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueChar {
    public static void main(String[] args) {
        String str = "aabacbebebe"; int k=3;
        int ans = search(str,k);
        System.out.println(ans);
    }
    public static int search(String str, int k){
        int start = 0, end = 0;
        int maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();

        while (end<str.length()){
            char ch = str.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.size()==k){
                maxLen = Math.max(maxLen,end-start+1);
            }else if (map.size()>k) {
                char leftChar = str.charAt(start);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                start++;
            }
            end++;

        }
        return maxLen;

    }
}

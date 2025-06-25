package JavaDevImpQues.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubtringWithUniqChar {
    public static void main(String[] args) {
         String str="geeksforgeeks";
         String ans = longestUniqueSubstr(str);
         System.out.println(ans);  //


    }
    public static  String longestUniqueSubstr(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            // find the length
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
         String ans=s.substring(start, start + maxLength);
         return ans;
    }
}

package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOCcranceOfAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr", pat = "for";
        int search = search(pat, txt);
        System.out.println(search);
    }
     static int search(String pat, String txt) {
         int k = pat.length();
         int ans=0;
         int i=0; int j=0;
         Map<Character, Integer> map = new HashMap<>();

         for (int l = 0; l < k; l++) {
             char ch = pat.charAt(l);
             map.put(ch,map.getOrDefault(ch,0)+1);
         }

         int count = map.size();

         while (j < txt.length()) {
             // Reduce frequency when a character enters the window
             char ch = txt.charAt(j);
             if (map.containsKey(ch)) {
                 map.put(ch, map.get(ch) - 1);
                 if (map.get(ch) == 0) {
                     count--; // Character count reduced to 0, means all needed occurrences found
                 }
             }
             if (j - i + 1 < k) {
                 j++; // Expand window
             } else if (j - i + 1 == k) { // When window size matches k
                 if (count == 0) {
                     ans++; // Found an anagram
                 }

                 // Before sliding, restore the character at i
                 char leftChar = txt.charAt(i);
                 if (map.containsKey(leftChar)) {
                     if (map.get(leftChar) == 0) {
                         count++; // Restoring a previously matched character
                     }
                     map.put(leftChar, map.get(leftChar) + 1);
                 }

                 // Slide window forward
                 i++;
                 j++;
             }
         }
         return ans;
    }
}

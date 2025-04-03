package HashMap;

import java.util.HashMap;

// 3223
public class MinimumLengthOfStringAfterOperations {
    public static void main(String[] args) {
         String s = "abaacbcbb";
         int ans = minimumLength(s);
         System.out.println(ans);
    }
    public static int minimumLength(String s) {

        int n = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        int deleted = 0;

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // If the character appears 3 times, reduce its count by 2
            if (freq.get(ch) == 3) {
                freq.put(ch, freq.get(ch) - 2);
                deleted += 2;
            }
        }

 return n - deleted;

    }
}

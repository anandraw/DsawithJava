package String.medium;

import java.util.*;

//3085. Minimum Deletions to Make String K-Special
public class MinDeleToMakeStringKSpl {
    public static void main(String[] args) {
       String word = "aaabaaa"; int  k = 2;
       int ans = minimumDeletions(word,k);
        System.out.println(ans);
    }
    public static int minimumDeletions(String word, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(freq.values());
        Collections.sort(counts);

        //System.out.println(counts);

        int n = counts.size();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int range = counts.get(i) + k;
            int total = counts.get(i);

            for (int j = i + 1; j < n; j++) {
                if (counts.get(j) > range)
                    total += range;
                else
                    total += counts.get(j);
            }

            int remain = word.length() - total;
            ans = Math.min(ans, remain);
        }

        return ans;
    }
}
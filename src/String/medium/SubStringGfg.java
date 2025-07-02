package String.medium;

//Substrings of length k with k-1 distinct elements
//Input: "aabab", k = 3
//Output: 3
//Explanation: Possible substring of length k = 3 are,
//aab : 2 distinct characters
//aba : 2 distinct characters
//bab : 2 distinct characters
//All these substring are valid so, the total count is equal to 3.

import java.util.HashMap;

public class SubStringGfg {
    public static void main(String[] args) {
        String str="aabab"; int k=3;
        int ans=substrCount(str,k);
        System.out.println(ans);
    }
    public static int substrCount(String s, int k) {

        int cnt = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : sub.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            if (map.size() == k - 1) {
                cnt++;
            }
        }
        return cnt;
    }




        //        int i=0, j=0;
//        int n = s.length();
//        int cnt = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        while(j<n) {
//            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
//            if (j - i + 1 > k) {
//                char c = s.charAt(i);
//                map.put(c, map.get(c) - 1);
//                if (map.get(c) == 0) {
//                    map.remove(c);
//                }
//                i++;
//            }
//            if (j - i + 1 == k && map.size() == k - 1) {
//                cnt++;
//            }
//            j++;
//        }
//        return cnt;
//    }
}

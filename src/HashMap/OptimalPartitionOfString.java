package HashMap;

import java.util.HashSet;

// 2045
public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String s = "abacaba";
        int ans = partitionString(s);
        System.out.println(ans);
    }

    public static int partitionString(String s) {

        HashSet<Character> set = new HashSet<>();
        int cnt=1;

        for (char ch : s.toCharArray()){
            if (set.contains(ch)){
                cnt++;
                set.clear();
            }
            set.add(ch);
        }
        return cnt;
    }
}
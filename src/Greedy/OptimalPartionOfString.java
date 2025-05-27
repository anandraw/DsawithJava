package Greedy;

import java.util.HashSet;

//2405
public class OptimalPartionOfString {
    public static void main(String[] args) {
        String s = "abacaba";
        int ans=partitionString(s);
        System.out.println(ans);
    }
    static int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=1;

        for (char ch:s.toCharArray()){
            if (set.contains(ch)){
                count++;
                set.clear();
            }
            set.add(ch);
        }
        return count;
    }
}

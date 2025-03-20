package Backtraking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "abc";
        List<String> result = findPermutation(s);
        result.forEach(System.out::println);

    }
    public static ArrayList<String> findPermutation(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder(s);
        recurPermute(0, str, ans);
        Collections.sort(ans);
        return ans;
    }

    static void recurPermute(int index, StringBuilder str, ArrayList<String> ans) {
        if (index == str.length() - 1) {
            ans.add(str.toString());
            return;
        }
        for (int i = index; i < str.length(); i++) {
            swap(str, index, i);
            recurPermute(index + 1, str, ans);
            swap(str, index, i); // backtrack
        }
    }
    static void swap(StringBuilder str, int start, int end) {
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);

    }

}

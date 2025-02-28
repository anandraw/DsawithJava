package Recursion.subset;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
    //   sunseq("abc","");
        System.out.println(subseq("abc",""));

    }
    static void sunseq(String str, String ans){
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        sunseq(str.substring(1), ans + ch);
        sunseq(str.substring(1), ans);
    }

    static ArrayList<String> subseq(String str, String ans){
        ArrayList<String> result = new ArrayList<>();
        if (str.isEmpty()) {
          result.add(ans);
            return result;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subseq(str.substring(1), ans + ch);
        ArrayList<String> right = subseq(str.substring(1), ans);

        left.addAll(right);
        return left;
    }
}

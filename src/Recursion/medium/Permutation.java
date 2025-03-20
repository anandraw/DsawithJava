package Recursion.medium;

import java.util.ArrayList;

// revison
public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
        ArrayList<String> ans = findPermutation("", "abc");
        System.out.println(ans);
    }
    static void permutation(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0, i);
            String sec = p.substring(i,p.length());
            permutation(first+ch+sec,up.substring(1));
        }

    }
    public static ArrayList<String> findPermutation(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(p);
            return result;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0, i);
            String sec = p.substring(i,p.length());
           ans.addAll(findPermutation(first+ch+sec,up.substring(1)));
        }

        return ans;
    }
}

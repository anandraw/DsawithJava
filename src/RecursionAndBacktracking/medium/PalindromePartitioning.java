package RecursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "geeks";
        List<List<String>> partition = partition(s);
        System.out.println(partition);

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        bactrack(s,result,new ArrayList<>(),0);
        return result;
    }

     static void bactrack(String s, List<List<String>> result, ArrayList<String> ds, int start) {
        //base condtion
        if (start==s.length()){
            result.add(new ArrayList<>(ds));
            return;
        }
        //do itratyion
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s,start,i)){
                ds.add(s.substring(start,i+1));
                bactrack(s,result,ds,i+1);
                ds.remove(ds.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

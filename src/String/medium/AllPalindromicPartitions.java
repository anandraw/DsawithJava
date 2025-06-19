package String.medium;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromicPartitions {
    public static void main(String[] args) {
       String str="geeks";  // [[g, e, e, k, s], [g, ee, k, s]]
        ArrayList<ArrayList<String>> arrayLists = palinParts(str);
        System.out.println(arrayLists);
    }
    public  static ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        bactrack(s,ans,new ArrayList<>(),0);
        return ans;
    }

    private static void bactrack(String s,ArrayList<ArrayList<String>> ans,ArrayList<String> ds, int start){
        //base condtion
        if(start==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=start; i<s.length(); i++){
            if(isPlaindrome(s,start,i)) {
                ds.add(s.substring(start, i + 1));
                bactrack(s, ans, ds, i + 1);
                ds.remove(ds.size() - 1);
            }
        }
    }


    private static boolean isPlaindrome(String str, int start, int end){
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

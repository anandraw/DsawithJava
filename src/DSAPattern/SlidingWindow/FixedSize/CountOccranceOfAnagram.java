package DSAPattern.SlidingWindow.FixedSize;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccranceOfAnagram {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr", pat = "for";
        int search = usingStringBuilder(pat, txt);
        System.out.println(search);
     }
     static int search(String pat, String txt) {
        int k = pat.length();
        int start=0;
        int end=0;
        int ans=0;
        Map<Character, Integer> map = new HashMap<>();

         for (int i = 0; i <k ; i++) {
             char ch = pat.charAt(i);
             map.put(ch,map.getOrDefault(ch,0)+1);
         }
         int count = map.size();

         while (end<txt.length()){
             char ch = txt.charAt(end);
             if (map.containsKey(ch)){
                 map.put(ch, map.get(ch)-1);
                if (map.get(ch)==0){
                    count--;
                }
             }

             if (end-start+1<k){
                 end++;
             }
             else if (end-start+1==k){
                 if (count==0){
                     ans++;
                 }
                 char leftChar = txt.charAt(start);
                     if (map.containsKey(leftChar)){
                         if (map.get(leftChar)==0){
                             count++;
                         }
                         map.put(leftChar,map.get(leftChar)+1);
                     }
                     start++;
                     end++;
                 }
         }
        return ans;
    }

    static  int usingStringBuilder(String pat, String str){
        int k = pat.length();
        int start=0; int end=0; int ans=0;

        char[] sunStringarr = pat.toCharArray();
        Arrays.sort(sunStringarr);

        String newPatString = new String(sunStringarr);

        while (end<str.length()){
            if (end-start+1<k){
                end++;
            } else if (end-start+1==k) {
                StringBuilder sb = new StringBuilder();
                for (int i = start; i <=end ; i++) {
                    sb.append(str.charAt(i));
                }
                char[] newarr =sb.toString().toCharArray();
                Arrays.sort(newarr);

                if (newPatString.equals(new String(newarr))){
                    ans++;
                }
                start++;
                end--;

            }
        }
        return ans;
    }
}

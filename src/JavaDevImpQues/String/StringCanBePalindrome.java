package JavaDevImpQues.String;

import java.util.HashMap;


public class StringCanBePalindrome {
    public static void main(String[] args) {
        String str = "aabbc"; // try "ivicc", "aabb", "abc" etc.
        boolean result = canFormPalindrome(str);
        System.out.println(result);
    }
    public static boolean canFormPalindrome(String s) {
          // idea is that only one add char is allowed
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // cnt odd frq
        int oddFrq=0;
         for (int freq : map.values()){
             if (freq%2!=0){
                 oddFrq++;
             }
             if (oddFrq>1) return false;
         }
         return true;
    }
}

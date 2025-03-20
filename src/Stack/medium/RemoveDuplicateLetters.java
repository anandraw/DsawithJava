package Stack.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
       String s = "bcabc";
       String result = removeDuplicateLetters(s);
        System.out.println(result);

    }
    public  static  String removeDuplicateLetters(String s) {

        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()){
            if (!set.contains(ch)){
                set.add(ch);
                builder.append(ch);
            }
        }
        char[]  arr =builder.toString().toCharArray();
        Arrays.sort(arr);
        return  new String(arr);
    }
}

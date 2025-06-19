package JavaDevImpQues.String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// check if two string are anagram of each other
public class CheckAngram {
    public static void main(String[] args) {

        String s1="cat",s2="tac";

         //methode 1
        char[] s=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(s);
        Arrays.sort(b);

        String str = new String(s);
        String str2 = new String(b);

        if (str.equals(str2)){
            System.out.println("string are anagram");
        }else{
            System.out.println("not an anagram");
        }

        //**************************************************************************************

        //methode 2
        Map<Character, Long> freqMap1=s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character,Long> freqMap2=s2.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        if (freqMap1.equals(freqMap2)){
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Not an anagram");
        }
    }
}


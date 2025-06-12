package JavaDevImpQues.String;

// Write a program to find the first repeated character in a string.
// Write a program to find the first repeated character in a string form last.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepetedChar {
    public static void main(String[] args) {
        String word = "Programming";
        // usingSet(word);
        // usingMap(word);
        // usingArr(word);
        // usingStrem(word);

    }

    public static void usingSet(String word){
        word=word.toLowerCase();
        char[] charArray = word.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : charArray ){
            if (set.contains(ch)){
                System.out.println("first repetating char : " + ch);
                break;
            }
            set.add(ch);
        }
    }

    public static void usingMap(String word){
        word=word.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                System.out.println("first repeating character : "+ entry.getKey());
                break;
            }
        }
    }

    public static void usingArr(String word){
        word=word.toLowerCase();
        int[] cnt = new int[256];

        for (char ch : word.toCharArray()){
            cnt[ch]++;
        }

        for (char ch : word.toCharArray()){
            if (cnt[ch]>1){
                System.out.println("first repeating char : "+ ch);
                break;
            }
        }
    }

    public static void usingStrem(String word){

        Set<Character> set=new HashSet<>();
        Character repchar = word.toLowerCase().chars().mapToObj(c ->{
            char ch = (char) c;
            return ch;
        })
                .filter(c -> !set.add(c))
                .findFirst()
                .orElse(null);
        System.out.println("first repeateting char : "+ repchar);
    }
}
package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.Map;

public class FreqOfChar {
    public static void main(String[] args) {
        String word = "Programming";
        countFre(word);
    }

    public static void countFre(String word){
        word=word.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}

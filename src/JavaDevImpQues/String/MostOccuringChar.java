package JavaDevImpQues.String;

//Find the most frequently occurring character in a string.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostOccuringChar {
    public static void main(String[] args) {
        String word="Aaanfdd";
        mostOccurChar(word);
        usingStream(word);
        usingTreeMap(word);
    }

    public static void mostOccurChar(String word){

        HashMap<Character,Integer> map = new HashMap<>();
        int maxFre = Integer.MIN_VALUE;
        for (char ch : word.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            maxFre=Math.max(maxFre, entry.getValue());
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==maxFre){
                System.out.println("Most occurring character: '" + entry.getKey() + "' occurred " + entry.getValue() + " times.");
            }
        }
    }

    public static void usingStream(String word){

        Map.Entry<Character, Long> result = word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (result != null) {
            System.out.println("Most occurring character: '" + result.getKey() + "' occurred " + result.getValue() + " times.");
        }
    }

    public static void usingTreeMap(String word){
        Map<Character,Integer> map = new TreeMap<>();
        for (char ch:word.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max= Collections.max(map.values());
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==max){
                System.out.println("Most occurring character: '" + entry.getKey() + "' occurred " + entry.getValue() + " times.");
            }
        }
    }
}

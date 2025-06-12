package JavaDevImpQues.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountUniqueChar {
    public static void main(String[] args) {
        String word ="Anand";
        countChar(word);
        countCharUsingMap(word);
        usingStream(word);
    }

    public static int countChar(String word){
        Set<Character> set = new HashSet<>();
        for (char ch : word.toLowerCase().toCharArray()){
             if (set.contains(ch)){
                 continue;
             }
             set.add(ch);
        }
        return set.size();
    }

    public static int countCharUsingMap(String word){
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : word.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if (entry.getValue() >= 1){
                list.add(entry.getKey());
            }
        }
        return list.size();
    }

    public static void usingStream(String word){
        long count = word.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() >= 1)
                .count();
        System.out.println(count);
    }
}

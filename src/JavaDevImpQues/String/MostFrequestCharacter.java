package JavaDevImpQues.String;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the most frequently occurring character in a string.
public class MostFrequestCharacter {
    public static void main(String[] args) {
        String str = "Aaanfdd";
        char result = getMostFrequentChar(str);
        System.out.println("Most frequent character: " + result);
        getMostFrequentCharStrem(str);
    }

    private static char getMostFrequentChar(String str) {
        Map<Character,Integer> freeMap=new HashMap<>();
        for (char ch:str.toLowerCase().toCharArray()){
            freeMap.put(ch,freeMap.getOrDefault(ch,0)+1);
        }

        int maxFre=0;
        char maxChar='\0';

        for(Map.Entry<Character,Integer> entry:freeMap.entrySet()){
            if (entry.getValue()>maxFre){
                maxFre=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        return maxChar;
    }

    //using strem
    private static void getMostFrequentCharStrem(String str) {

        Optional<Character> mostFrequentchar = str.toLowerCase().chars().mapToObj(a -> (char) a)
                .filter(ch -> !Character.isWhitespace(ch))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
        System.out.println(mostFrequentchar);
    }
}

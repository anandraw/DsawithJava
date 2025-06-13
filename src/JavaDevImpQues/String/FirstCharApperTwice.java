package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Find the first character in a string that appears exactly twice
public class FirstCharApperTwice {
    public static void main(String[] args) {
        String word ="Aabcdd";
        findFirst(word);
    }

    public static void findFirst(String word){

        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : word.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==2){
                System.out.println("first char who occar twice is : "+ entry.getKey());
                break;
            }
        }
    }
}


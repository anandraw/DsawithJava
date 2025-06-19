package TwoPointerAlgo;

import java.util.HashMap;
import java.util.Map;

//Write a program to find the **first repeated character** in a string.
//
public class Smaple {
    public static void main(String[] args) {
        String str="annd";
        Map<Character,Integer> map = new HashMap();

        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==1){
                System.out.print("first repeted  char : "+ entry.getKey());
            }
        }
    }
}

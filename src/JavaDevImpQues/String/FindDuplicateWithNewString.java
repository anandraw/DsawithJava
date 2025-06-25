package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWithNewString {
    public static void main(String[] args) {
        String str="anand";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                sb.append(entry.getKey());
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}

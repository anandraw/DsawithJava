package Array.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainChracter{
    public static void main(String[] args) {
           String str ="BABBRAR";

           char[] charArray = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for (char c : charArray){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> r : map.entrySet()){
            if (r.getKey()>1){
                System.out.println(r.getKey()+" "+r.getValue());
            }
        }

    }


}

package HashMap;

import java.util.HashMap;


// leetoce : 791
public class CustomSortString {
    public static void main(String[] args) {
        String order = "kqep", s = "pekeq";
        String ans = customSortString(order,s);
        System.out.println(ans);
    }
    public static String customSortString(String order, String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder result = new StringBuilder();
        for (char ch:order.toCharArray()){
           if (map.containsKey(ch)){
               int freq = map.get(ch);
               result.append(String.valueOf(ch).repeat(freq));
               map.remove(ch);
           }
        }
        for (char ch:s.toCharArray()){
            if (map.containsKey(ch)){
                int freq = map.get(ch);
                result.append(String.valueOf(ch).repeat(freq));
                map.remove(ch);
            }
        }
        return result.toString();

    }
}

package JavaDevImpQues.String;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the kth non-repeated character in a string.
public class KthNonRepeatedChar  {
    public static void main(String[] args) {
        String str = "aabcbddex"; // posiiblities : c,e,x
        int k = 2;
        Character result = findKthNonRepeatedChar(str, k);
        if (result != null)
            System.out.println("Kth non-repeated character: " + result);
        else
            System.out.println("Less than " + k + " non-repeated characters.");
    }
    public static Character findKthNonRepeatedChar(String str, int k) {
        // first we want to maintain order
        Map<Character,Integer> map = new LinkedHashMap<>();  // insertion order fallow

        for (char ch : str.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int cnt=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==1){
                cnt++;
                if (cnt==k){
                    return entry.getKey();
                }
            }
        }
        return null;
    }
}

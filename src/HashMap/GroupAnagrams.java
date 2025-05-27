package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagrams(words));
    }
    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String str:arr){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for(List<String> group:map.values()){
            result.add(new ArrayList<>(group));
        }

        return result;
    }
}

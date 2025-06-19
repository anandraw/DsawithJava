package JavaDevImpQues.String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//remove all repeated character form the string
public class RemoveRepetedChar {
    public static void main(String[] args) {

        String s = "Programming";
        StringBuilder result = new StringBuilder();
        Map<Character, Boolean> seen = new HashMap<>();

        for (char ch : s.toLowerCase().toCharArray()) {
            if (!seen.containsKey(ch)) {
                result.append(ch);
                seen.put(ch, true);
            }
        }
        System.out.println(result);

        //***********************************************************

        s=s.toLowerCase();
        boolean[] occur = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for (char ch:s.toCharArray()){
            int index = ch - 'a';
            if (!occur[index]){
                ans.append(ch);
                occur[index]=true;
            }
        }
        System.out.println(ans);


        //***************************************************************


        String newans = s.toLowerCase().chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(newans);
    }
}

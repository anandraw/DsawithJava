package String.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CaseSpecificSortingOfString {
    public static void main(String[] args) {
        String s = "GEekS";
        String result = caseSort(s);
        System.out.println(result);
    }
    public static String caseSort(String s) {

        // case 1 : if string has only uppercase or lowercase characters
        // MANGO , hdsfj
        char[] arr = s.toCharArray();
        boolean isUpper=false;
        boolean isLower=false;

        for(char ch:arr){
            if(Character.isUpperCase(ch)) isUpper=true;
            if(Character.isLowerCase(ch)) isLower=true;
        }

        if(!isUpper || !isLower){
            Arrays.sort(arr);
            return new String(arr);
        }

        // case 2 : "GEekS"
        StringBuilder result = new StringBuilder();

        List<Character> upperChar = new ArrayList<>();
        List<Character> lowerChar = new ArrayList<>();

        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)) upperChar.add(ch);
            else lowerChar.add(ch);
        }

        Collections.sort(upperChar);
        Collections.sort(lowerChar);

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                result.append(upperChar.getFirst()); // upperChar.get(0)
                upperChar.removeFirst();  // upperChar.remove(0)
            }
            else{
                result.append(lowerChar.getFirst());
                lowerChar.removeFirst();
            }
        }
        return result.toString();
    }
}

package JavaDevImpQues.String;

//Check if all characters in a string are unique.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringIsUniqueOrNot {
    public static void main(String[] args) {

        String word="abcd";

        Set<Character> collect = word.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        if (collect.size()==word.length()){
            System.out.println("is unique char string");
        }else{
            System.out.println("not a unique");
        }

        boolean ans=isUnique(word);
        System.out.println(ans);
    }

    public static boolean isUnique(String str){
//        int len= str.length();
//        if (str.isEmpty()){
//            return true;
//        }
//        Set<Character> set = new HashSet<>();
//        for (char ch : str.toLowerCase().toCharArray()){
//            if (set.contains(ch)){
//                break;
//            }
//            set.add(ch);
//        }
//        if (len==set.size()){
//            return true;
//        }
//        return false;

        HashMap<Character,Integer> map=new HashMap<>();

        for (char ch:str.toLowerCase().toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>1){
                return false;
            }
        }
        return true;
    }
}

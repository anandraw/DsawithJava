package GggeksForGeeks;
import java.util.HashMap;

public class Day17 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = nonRepeatingChar(s);
        System.out.println(ch);
    }
    static char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';

    }
}

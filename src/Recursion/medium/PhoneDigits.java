package Recursion.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDigits {
    public static void main(String[] args) {
          // pad("","12");
        List<String> strings = letterCombinations("23");
        //System.out.println(strings);

        int [] arr ={2,3};
        ArrayList<String> strings1 = possibleWords(arr);
        System.out.println(strings1);


    }

    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0'; // this will convert '2' int  2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch =(char) ('a'+i);
            pad(p+ch,up.substring(1));
        }
    }

    // solution2
    static String[] map = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public  static List<String> letterCombinations(String digits) {

        // base condition
        ArrayList<String> ans = new ArrayList<>();
        if (digits.isEmpty()){
            return ans;
        }

        generateCombination(digits,"",ans);
        return ans;

    }

    private static void generateCombination(String digits, String up, ArrayList<String> ans) {
        if (digits.isEmpty()){
            ans.add(up);
            return;
        }
        int digit = digits.charAt(0)-'0';
        String possibleLetters = map[digit];

        for (int i = 0; i < possibleLetters.length(); i++) {
            generateCombination(digits.substring(1), up + possibleLetters.charAt(i), ans);
        }
    }

    //gfg
    static HashMap<Integer,String> mapp = new HashMap<>();
    static {
        mapp.put(1,null);
        mapp.put(2,"abc");
        mapp.put(3,"def");
        mapp.put(4,"ghi");
        mapp.put(5,"jkl");
        mapp.put(6,"mno");
        mapp.put(7,"pqrs");
        mapp.put(8,"tuv");
        mapp.put(9,"wxyz");
    }

    public static ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        if(arr.length==0){
           return ans;
        }
        generateCombinations(arr,0,"",ans);
        return ans;

    }

    static void generateCombinations(int[] arr,int index, String up, ArrayList<String> ans) {
        if (index == arr.length) {
            ans.add(up);
            return;
        }
        String letters = mapp.get(arr[index]);
        if (letters != null) {
            for (char c : letters.toCharArray()) {
                generateCombinations(arr, index + 1, up + c, ans);
            }
        }



    }


}

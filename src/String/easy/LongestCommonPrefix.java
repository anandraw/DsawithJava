package String.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String ans =longestCommonPrefix(arr);
        System.out.println(ans);
    }
    public static String longestCommonPrefix(String arr[]) {

        Arrays.sort(arr);
        String str1=arr[0];
        String str2=arr[arr.length-1];
        int index=0;
        while (index<str1.length()){
            if (str1.charAt(index)==str2.charAt(index)){
                index++;
            }else {
                break;
            }
        }
        return index==0?"":str1.substring(0,index);
    }
}

package Recursion;

public class LenghtOfString {
    public static void main(String[] args) {
        String str ="GeeksforGeeks";
        System.out.println(recLen(str));
    }
     static int recLen(String str) {
         if (str.equals("")) {
             return 0;
         } else {
             return recLen(str.substring(0, str.length() - 1)) + 1;
         }
     }
    }

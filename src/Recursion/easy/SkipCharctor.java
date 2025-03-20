package Recursion.easy;

public class SkipCharctor {
    public static void main(String[] args) {
        skip("baccba"," ");
        System.out.println(skip1("baaccaah"));
        System.out.println(skipsubstring("baaanandbaarawool"));
    }
    public static void skip(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch=='a'){
            skip(str.substring(1),ans);
        }else{
            skip(str.substring(1),ans+ch);
        }
    }
    public static String skip1(String str) {
        if (str.isEmpty()) {
            return " ";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip1(str.substring(1));
        } else {
            return ch+skip1(str.substring(1));
        }
    }
    public static String skipsubstring(String str) {
        if (str.isEmpty()) {
            return " ";
        }
        if (str.startsWith("baa")) {
            return skipsubstring(str.substring(3));
        } else {
            return str.charAt(0)+ skipsubstring(str.substring(1));
        }
    }
}

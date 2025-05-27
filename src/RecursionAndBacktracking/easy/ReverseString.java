package RecursionAndBacktracking.easy;

public class ReverseString {
    public static void main(String[] args) {
         String name ="Anand Ganesh Rawool";
   //      reverse(name);
        String s = reverse2(name, name.length());
        System.out.print(s);
    }
    static void reverse(String str){
        if ((str==null)||(str.length() <= 1))
            System.out.print(str);
        else{
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));

        }
    }

    static String reverse2(String str, int len){
        if (len < 1) {
            return "";
        }

        // Base case
        if (len == 1) {
            return String.valueOf(str.charAt(0));
        }

        return str.charAt(len-1)+ reverse2(str,len-1);
    }
}

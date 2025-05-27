package String.easy;


public class ReverseString {
    public static void main(String[] args) {
        String s = "Anand";
        reverseString(s);
       // System.out.println(s1);

    }
    public static void reverseString(String s) {
       // return new StringBuilder(s).reverse().toString();

        //using two pinter
//        int start=0;
//        int end=s.length()-1;
//        char[] ch =s.toCharArray();
//        while (start<end){
//            char tmp=ch[start];
//          ch[start] =ch[end];
//          ch[end]=tmp;
//          start++;
//          end--;
//        }
//       return  new String(ch);

//        StringBuilder reverse = new StringBuilder(s).reverse();
//        String string = reverse.toString();
//        System.out.println(string);


//        char ch;
//        String nstr = "";
//        for (int i = 0; i < s.length(); i++) {
//            ch = s.charAt(i);
//            nstr = ch + nstr ;
//        }
//        System.out.println("Reversed String is : " + nstr);

        // forward direction
//        String newStr="";
//        char ch;
//
//        for (int i = 0; i < s.length(); i++) {
//            ch=s.charAt(i);
//            newStr=ch+newStr;
//        }
//        System.out.println(newStr);
    }

}

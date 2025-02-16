package String.easy;


public class ReverseString {
    public static void main(String[] args) {
        String s = "i like this program very much";
        String s1 = reverseString(s);
        System.out.println(s1);

    }
    public static String reverseString(String s) {
       // return new StringBuilder(s).reverse().toString();

        //using two pinter
        int start=0;
        int end=s.length()-1;
        char[] ch =s.toCharArray();
        while (start<end){
            char tmp=ch[start];
          ch[start] =ch[end];
          ch[end]=tmp;
          start++;
          end--;
        }
       return  new String(ch);
    }

}

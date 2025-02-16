package String.medium;

import java.math.BigInteger;

public class SumTwoLN {
    public static void main(String[] args) {
       String s1 = "2349";
       String s2 = "68";
      String r= findSum(s1,s2);
        System.out.println(r);
    }
     static String findSum(String s1, String s2) {

        int carry=0;int rem=0;int i=s1.length()-1;int j= s2.length()-1;
        String s="";
         s1 = s1.replaceFirst("^0+", "");
         s2 = s2.replaceFirst("^0+", "");


         if (s1.isEmpty() && s2.isEmpty()) {
             return "0";
         }

        while (i>=0&&j>=0){
            int a = s1.charAt(i)-'0';
            int b = s2.charAt(j)-'0';
            int sum=a+b+carry;
            rem=sum%10;
            carry=sum/10;
            s=rem+s;
            i--;j--;
        }
        while (i>=0){
            int a = s1.charAt(i)-'0';
            int sum=a+carry;
            rem=sum%10;
            carry=sum/10;
            s=rem+s;
            i--;
        }

        while (i>=0){
            int a = s1.charAt(j)-'0';
            int sum=a+carry;
            rem=sum%10;
            carry=sum/10;
            s=rem+s;
            j--;
        }
        if (carry==1){
            s=1+s;
        }
         for (int k = 0; k < s.length(); k++) {
             int a = s.charAt(k)-'0';
             if (a!=0) return s.substring(k,s.length());
         }
         return "0";

     }

}

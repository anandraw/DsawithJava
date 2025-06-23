package Array.medium;

import java.util.Arrays;

public class MinimumSum {
    public static void main(String[] args) {
       int arr[] = {6, 8, 4, 5, 2, 3};
       String ans =minSum(arr);
        System.out.println(ans);
    }
    static String minSum(int[] arr) {
        // code here
        Arrays.sort(arr); // 2 3 4 5 6 8  take alternate num
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean flag=true;

        for (int num:arr){
            if (flag){
                sb1.append(num);
            }else {
                sb2.append(num);
            }
            flag=!flag;
        }
        int i=sb1.length()-1, j=sb2.length()-1, carry=0;
        while (i>=0 || j>=0 || carry==1){
            int digit1=0, dight2=0;
            if(i>=0){
                digit1=sb1.charAt(i)-'0';
                i--;
            }
            if (j>=0){
                dight2=sb2.charAt(j)-'0';
                j--;
            }
            int sum = digit1+dight2+carry;
            ans.append(sum%10);
            carry=sum/10;
        }
        String a = ans.reverse().toString();
        int z=0;
        while (z<a.length() && a.charAt(z)=='0'){
            z++;
        }
        return a.substring(z);
    }

}

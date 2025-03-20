package Stack.medium;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "112"; int k = 1;
        String s = removeKdigits(num, k);
        System.out.println(s);
    }
    // this monotom=nictsack problema they folle order
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        if (k==n){
            return "0";
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            while (k>0 && !stack.isEmpty() && stack.peek()>ch ){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        // if all are increasing order remove last elements
        while(k>0){
            stack.pop();
            k--;
        }


        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();

        //remove all the 0 at the head
        while(stringBuilder.length()>1 && stringBuilder.charAt(0)=='0')
            stringBuilder.deleteCharAt(0);
        return stringBuilder.toString();
    }
}

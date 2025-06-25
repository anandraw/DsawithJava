package String.medium;


import java.util.Stack;

//Lexicographically Largest String After K Deletions
public class LongestStringAfterKDeletion {
    public static void main(String[] args) {
        String str="zebra";
        int k=2;
        String ans=maxSubseq(str,k);
        System.out.println(ans);

    }
    public static String maxSubseq(String s, int k) {
        Stack<Character> stack = new Stack<>();
        int n =s.length();
        int keep=n-k;

        for (int i = 0; i <n ; i++) {
            char c= s.charAt(i);

            while (!stack.isEmpty() && k>0 && c>stack.peek()){
                  stack.pop();
                  k--;
            }
            stack.push(c);

        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.substring(0, keep);
    }
}

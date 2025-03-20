package Stack.medium;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        int ans =evalRPN(tokens);
        System.out.println(ans);

    }
//    public static int evalRPN(String[] tokens) {
//        Stack<String> stack = new Stack<>();
//        String choice;
//        int x,y;
//        int sum=0;
//        String result ="";
//        String p = "";
//
//        for (int i = 0; i < tokens.length; i++) {
//            if (tokens[i] != "+" && tokens[i] != "-"
//                    && tokens[i] != "*" && tokens[i] != "/"){
//                stack.push(tokens[i]);
//                continue;
//
//            }else {
//                choice = tokens[i];
//            }
//
//            switch (choice){
//                case "+":
//                  x =   Integer.parseInt(stack.pop());
//                  y =   Integer.parseInt(stack.pop());
//                  sum = x+y;
//                  result=  p + sum;
//                  stack.push(result);
//                  break;
//
//                case "-":
//                    x =   Integer.parseInt(stack.pop());
//                    y =   Integer.parseInt(stack.pop());
//                    sum = x-y;
//                    result=  p + sum;
//                    stack.push(result);
//                    break;
//
//                case "*":
//                    x =   Integer.parseInt(stack.pop());
//                    y =   Integer.parseInt(stack.pop());
//                    sum = x*y;
//                    result=  p + sum;
//                    stack.push(result);
//                    break;
//
//                case "/":
//                    x =   Integer.parseInt(stack.pop());
//                    y =   Integer.parseInt(stack.pop());
//                    sum = x/y;
//                    result=  p + sum;
//                    stack.push(result);
//                    break;
//
//                default:
//                    continue;
//            }
//        }
//        return Integer.parseInt(stack.pop());




    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int y = stack.pop();
                int x = stack.pop();
                int result = 0;

                switch (token) {
                    case "+" -> result = x + y;
                    case "-" -> result = x - y;
                    case "*" -> result = x * y;
                    case "/" -> result = x / y;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}

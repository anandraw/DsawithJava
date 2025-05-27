package TestingShastra;

import java.util.Stack;

public class Testing {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(4);
        stack.add(5);

     //   LIFO - last in first out
        int s = stack.peek();
        System.out.println(s);

        int a  = stack.pop();
        System.out.println(a);








    }
}

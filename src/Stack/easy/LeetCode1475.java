package Stack.easy;

import java.util.Stack;

//Final Prices With a Special Discount in a Shop
public class LeetCode1475 {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        for (int i : finalPrices(prices)) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int price : finalPricesStack(prices)) {
            System.out.print(price+" ");
        }


    }

    static int[] finalPrices(int[] prices) {
       int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            result[i] = prices[i];
            for (int j = i+1; j < prices.length ; j++) {
                if (prices[j] <= prices[i]){
                    result[i] -= prices[j];
                    break;
                }
            }
        }
        return  result;
    }

    static int[] finalPricesStack(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                prices[stack.pop()] -= prices[i];
            stack.push(i);
        }
        return prices;
    }
}

package Array.medium;

public class StockBuyandSell {
    public static void main(String[] args) {
         int[] priceses ={7 ,1 ,5, 3 ,6 ,4};
         int reuslt = maximumProfitOneTrasaction(priceses);
        System.out.println(reuslt);
    }
    static int maximumProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static int maximumProfitOneTrasaction(int prices[]) {

        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        return maxProfit;
    }

}

package Greedy;

import java.util.ArrayList;
import java.util.List;

public class MinimumnumberofCoins {
    public static void main(String[] args) {
        int n=43;  // 20+20+2+1
        List<Integer> list = minPartition(n);
        System.out.println(list);
    }
    static List<Integer> minPartition(int N)
    {
        int currency[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while (N > 0) {
            if (currency[i] <= N) {
                N -= currency[i];
                ans.add(currency[i]);
            } else {
                i++;
            }
        }
        return ans;
    }
}

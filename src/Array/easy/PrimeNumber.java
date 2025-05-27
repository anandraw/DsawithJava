package Array.easy;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,67};
        ArrayList<Integer> list = printPrime(arr);
        System.out.println(list);
    }

    static ArrayList<Integer> printPrime(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int num:arr){
            if (isPrime(num)){
                result.add(num);
            }
        }
        return result;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

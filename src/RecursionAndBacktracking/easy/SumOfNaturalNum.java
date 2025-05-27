package RecursionAndBacktracking.easy;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int i = sumOfNum(5);
        System.out.println(i);
    }

    static int sumOfNum(int n){
        if(n<=1){
            return n;
        }
        return n+sumOfNum(n-1);
    }
}

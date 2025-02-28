package Recursion;

public class FactorialOfNum {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    static int fact(int n){

        //base conditiobn
        if(n==1){
            return n;
        }

        return n*fact(n-1);
    }
}

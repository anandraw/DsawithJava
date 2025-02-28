package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);

    }
        static void reverse(int n){
            int sum=0;
            if (n==0){
                return;
            }
            int rem=n%10;
            sum = (sum * 10) + rem;
            n=n/10;
            reverse(n);
        }


    }




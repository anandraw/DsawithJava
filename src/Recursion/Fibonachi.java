package Recursion;

public class Fibonachi {
    public static void main(String[] args) {
        int ans  = fibo(4);
      //  System.out.println(ans);
        for (int i : fibonacciNumbers(7)) {
            System.out.print(i+" ");
        }

    }
    static int fibo(int n){

        // base condition
        if(n<2){
            return n;
        }
        // logic
        return fibo(n-1)+fibo(n-2);
    }

    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = fib(i);
        }

        return arr;
    }
      static int fib(int i){
              if(i == 0) return 0;
              if(i < 3) return 1;

              return (fib(i-1) + fib(i-2));

    }
}

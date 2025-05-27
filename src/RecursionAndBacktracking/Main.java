package RecursionAndBacktracking;

public class Main {
    public static void main(String[] args) {
        int n =5;
      printNum(n);
        Nto1(n);

    }

    static void printNum(int n){
        if (n>0){
            printNum(n-1);
            System.out.print(n+" ");
        }
    }

    static void Nto1(int n){
        if(n>0){
            System.out.print(n+" ");
            Nto1(n-1);
        }
    }
}

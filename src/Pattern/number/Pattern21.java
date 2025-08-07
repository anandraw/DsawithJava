package Pattern.number;

public class Pattern21 {
    public static void main(String[] args) {
        int n=3;
        printPattern(n);
    }
    public static void printPattern(int n){

        int i=1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=3 ; col++) {
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
        }
    }
}

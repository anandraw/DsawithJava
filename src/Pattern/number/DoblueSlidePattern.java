package Pattern.number;

//        1
//      1 2 1
//    1 2 3 2 1
//  1 2 3 4 3 2 1
//    1 2 3 2 1
//      1 2 1
//        1

public class DoblueSlidePattern {
    public static void main(String[] args) {
         int n =4;
         printPattern(n);
    }
    public static void printPattern(int n){

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            //acending
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            //decending
            for (int j = i-1; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            for (int j = n - i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

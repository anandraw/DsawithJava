package Pattern.start;


//       *
//      * 1 *
//    * 1 2 3 *
//  * 1 2 3 4 5 *
//* * * * * * * * *

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; ++i) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            int currentNum = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(currentNum++ + " ");
                }
            }
            System.out.println();
        }
    }
}

package Pattern;

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int ch = 97;

        for (int i = 1; i <= n; ++i) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                if (i % 2 != 0) {
                    System.out.print(k + " ");
                }
                else {
                    System.out.print((char) (ch - 1 + k) + " ");
                }
            }
            System.out.println();
        }
    }
}

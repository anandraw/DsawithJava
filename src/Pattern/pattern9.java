package Pattern;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int ch = 97; // ASCII value of 'a'

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print((char) (ch - 1 + k) + " ");
            }

            System.out.println();

        }
    }
}

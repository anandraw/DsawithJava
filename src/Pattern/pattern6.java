package Pattern;

public class pattern6 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            int currentNum = 1;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == rows || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(currentNum++ + " ");
                }
            }
            System.out.println();
        }
    }
}

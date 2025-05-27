package Pattern;


public class pattern7 {
    public static void main(String[] args) {

        int n = 5;

        for ( int row = 1; row <= n; row++) {

            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

}

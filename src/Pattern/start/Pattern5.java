package Pattern.start;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a num : ");
        int n =  sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-1 ; j++) {
                System.out.print(" ");
            }
            //task is print star
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

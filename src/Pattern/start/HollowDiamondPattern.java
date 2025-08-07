package Pattern.start;

//*********
//**** ****
//***   ***
//**     **
//*       *
//**     **
//***   ***
//**** ****
//*********

 public class HollowDiamondPattern {
    public static void main(String[] args) {

        int n=5;
        // top side
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(i-1) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // bottom side
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

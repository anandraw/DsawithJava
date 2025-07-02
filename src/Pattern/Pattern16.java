package Pattern;

public class Pattern16 {
    public static void main(String[] args) {

    }
    public static void printPattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}

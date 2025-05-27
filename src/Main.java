import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[]= {1,5,3,4,8,9};
        System.out.println("Enter a number");

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();

        for(int num:arr) {
            if(num==a) {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");

    }
}
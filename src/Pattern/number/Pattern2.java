package Pattern.number;

//1 2 3
//4 5 6
//7 8 9

public class Pattern2{
    public static void main(String[] args) {
        int num=1;
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

package Pattern.number;

public class NumberchanignPyramid {
    public static void main(String[] args) {
        int n=4;
        int cnt=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();

        }

    }
}

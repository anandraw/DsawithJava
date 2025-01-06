package Array.easy;

import java.util.Arrays;

public class CheckEqualArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};int  b[] = {2, 4, 5, 0,7};
        boolean b1 = checkEqual(a, b);
        System.out.println(b1);

    }
    public static boolean checkEqual(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;

    }
}

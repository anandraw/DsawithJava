package GggeksForGeeks;

import java.util.Arrays;

public class day13 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 3, 1, 7};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] arr) {

        Arrays.sort(arr);
        int i=1;
        for (int j = 0; j <= arr.length; j++) {
            if (arr[j]==i){
                i++;
            }
            if (arr[j]> i){
                break;
            }
        }
        return i;
    }

}

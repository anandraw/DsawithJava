package GggeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//rotate array
public class Day4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; int d = 2;
//        rotateArr(arr,d);
        List<Integer> list = new ArrayList<>();
        for (int num: arr){
            list.add(num);
        }
        Collections.rotate(list,-d);
        System.out.println(list);
    }
    static void rotateArr(int arr[], int d) {
        int n= arr.length;
        d=d%n;

        int[] tmp = new int[d];

        for (int i = 0; i < d; i++) {
            tmp[i]=arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[n-d+i] = tmp[i];
        }
    }
}

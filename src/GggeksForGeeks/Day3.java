package GggeksForGeeks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
       reverseArray(arr);
       for (int num: arr){
           System.out.println(num);
       }




    }
    public static void reverseArray(int arr[]) {
        // code here
//        int[] reversedArray = IntStream.range(0, arr.length)
//                .map(i -> arr[arr.length - 1 - i])
//                .toArray();
//
//        System.out.println(Arrays.toString(reversedArray));

        int i=0,j=arr.length-1;
        while (i<j){
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
            i++;
            j--;
        }

    }
}

package Array.easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,4,4,5};

        int[] distinctArr=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(distinctArr));
    }
}

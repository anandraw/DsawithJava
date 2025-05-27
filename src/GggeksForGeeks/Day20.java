package GggeksForGeeks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day20 {
    public static void main(String[] args) {
        int arr[] ={0,2,1,0,0,1};
        sort012(arr);
    }
    public static void sort012(int[] arr) {
        // code here
        IntStream stream = Arrays.stream(arr);
        stream.boxed().sorted((a,b) -> a-b).collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

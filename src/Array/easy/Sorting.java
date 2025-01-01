package Array.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sorting {
    public static void main(String[] args) {
        int[] num = {10,20,30,40};
        int[] result = rearrangeArray(num);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;

        // Split into two lists: first half and second half
        List<Integer> firsHalf = IntStream.range(0, n / 2).mapToObj(num -> arr[num])
                .sorted().collect(Collectors.toList());

        List<Integer> secondHalf = IntStream.range(n / 2, n).mapToObj(num -> arr[num]).
                sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        return IntStream.concat(firsHalf.stream().mapToInt(Integer::intValue),
                secondHalf.stream().mapToInt(Integer::intValue)).toArray();
    }
}

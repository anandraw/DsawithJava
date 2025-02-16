package BinarySearch;

import java.util.ArrayList;


public class FirstAndLastOccrance {
    public static void main(String[] args) {
       int x = 3; int arr[] = {1, 3, 3, 4};
        ArrayList<Integer> list = firstAndLast(x, arr);
        System.out.println(list);

    }
    public static ArrayList<Integer> firstAndLast(int x, int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i; // Mark the first occurrence
                }
                last = i; // Update the last occurrence
            }
        }
        if (first == -1) {
            ans.add(-1); // If `x` is not found, return -1
        } else {
            ans.add(first); // Add first occurrence index
            ans.add(last);  // Add last occurrence index
        }
        return ans;
    }
}

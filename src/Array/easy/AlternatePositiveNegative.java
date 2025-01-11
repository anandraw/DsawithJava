package Array.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {
    public static void main(String[] args) {
       int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};

    }
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> nes = new ArrayList<>();

        for (int i = 0; i <arr.size() ; i++) {
            if (arr.get(i)>0) pos.add(arr.get(i));
            else nes.add(nes.get(i));
        }

        for (int i = 0; i <arr.size()/2 ; i++) {
           arr.set(2*i, pos.get(i));
           arr.set(2*i+1, nes.get(i));
        }

    }
}

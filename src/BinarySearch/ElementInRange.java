package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class ElementInRange {
    public static void main(String[] args) {
       int n = 7, A = 2, B = 5, arr[] =  {1, 4, 5, 2, 7, 8, 3};
        boolean b = check_elements(arr, n, A, B);
        System.out.println(b);
    }
    static boolean check_elements(int arr[], int n, int A, int B) {
        List<Integer>list = new ArrayList<>();
        for (int c:arr){
            list.add(c);
        }
        for(int v=A;v<=B;v++){
            if(!list.contains(v)){
                return false;
            }
        }
        return true;
    }
}

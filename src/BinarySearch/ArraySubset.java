package BinarySearch;

import java.util.HashSet;

public class ArraySubset {
    public static void main(String[] args) {
       int a[] = {11, 7, 1, 13, 21, 3, 7, 3};
       int b[] = {11, 3, 7, 1,89};
       boolean ans = isSubset(a,b);
        System.out.println(ans);

    }

    public static boolean isSubset(int a[], int b[]) {

         HashSet<Integer> set = new HashSet<>();
         for (int num : a) {
             set.add(num);
        }
         for (int num:b){
             if (set.contains(num)){
                 continue;
             }else {
                 return false;
             }
         }
         return true;
    }
}


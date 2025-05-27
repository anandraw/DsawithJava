package GggeksForGeeks;

import java.util.HashSet;
import java.util.Set;

public class Day45 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3,8};
        int ans=findUnion(a,b);
        System.out.println(ans);
    }
    public static int findUnion(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();

        for (int num:a){
            set.add(num);
        }
        for (int num:b){
            set.add(num);
        }
        return set.size();
    }
}

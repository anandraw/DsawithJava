package Greedy;

import java.util.Arrays;

public class AssignMiceHoles {
    public static void main(String[] args) {
       int N = 3, M[] = {4, -4, 2}, H[] = {4, 0, 5};  // output:4
        int ans = assignMiceHoles(N, M, H);
        System.out.println(ans);
    }
    static int assignMiceHoles(int N , int[] M , int[] H) {
        Arrays.sort(M);
        Arrays.sort(H);

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i<N ; i++) {
            ans = Math.max(ans,Math.abs(M[i]-H[i]));
        }
        return ans;
    }
}

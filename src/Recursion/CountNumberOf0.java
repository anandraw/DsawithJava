package Recursion;

public class CountNumberOf0 {
    public static void main(String[] args) {
        int n = 45000;
        int ans = numofZeros(n,0);
        System.out.println(ans);
    }

    static int numofZeros(int n, int cnt){
        if(n==0){
            return cnt;
        }
        int rem=n %10;
        if (rem==0){
            return numofZeros(n/10,cnt+1);
        }
        return numofZeros(n/10,cnt);

    }
}

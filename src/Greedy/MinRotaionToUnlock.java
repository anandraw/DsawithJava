package Greedy;

public class MinRotaionToUnlock {
    public static void main(String[] args) {
        int R = 2345, D = 5432;
        int ans = rotationCount(R,D);
        System.out.println(ans);
    }
    static int rotationCount(long R, long D){
        int ans=0;
        long first , second;

        while (R>0){
            first  =R%10;
            second =D%10;

            R=R/10;
            D=D/10;

            ans+=Math.min(Math.abs(first-second),10-Math.abs(first-second));

        }
        return ans;
    }
}

package RecursionAndBacktracking.medium;


public class ReachToLastStep {
    public static void main(String[] args) {
        int n = 3;
        int ways = countWays(n);
        System.out.println("Total ways to reach step " + n + " = " + ways);
    }

    public static int countWays(int n) {
        if (n == 0) return 1;  // base case: 1 way to stay at ground
        if (n < 0) return 0;   // invalid case: no steps possible

        // Try all three possibilities: 1 step, 2 steps, or 3 steps
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    static int countWayss(int n) {
        // your code here
        if(n==0||n==1)return n;
        int prev1=1;
        int prev2=2;
        int curr=0;
        for(int i=2;i<n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}

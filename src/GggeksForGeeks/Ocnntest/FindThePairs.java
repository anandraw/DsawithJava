package GggeksForGeeks.Ocnntest;

public class FindThePairs {
    public static void main(String[] args) {
        long[]arr ={1,2,3};
        long ans = countPairs(arr);
        System.out.println(ans);

    }
    public static long countPairs(long[] arr) {
        // code here
        int n = arr.length;
        long cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    long diffArr =  arr[i] - arr[j];
                    long diffIdx =  i - j;
                    if (diffArr % diffIdx == 0 && (diffArr / diffIdx) == 1) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}

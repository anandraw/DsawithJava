package GggeksForGeeks.Ocnntest;

public class CuurentMode255 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        System.out.println(longestSubsequence(arr, k));
    }
    public static int longestSubsequence(int[] arr, int k) {
        if(arr==null || arr.length==0) return 0;
        int len=1;
        int lastMode = arr[0]%k;

        for (int i = 1; i <arr.length ; i++) {
            int currMode = arr[i]%k;
            if (lastMode!=currMode){
                len++;
                lastMode=currMode;
            }
        }
        return len;
    }
}

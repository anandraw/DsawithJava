package Array.easy;

public class MaximumConsicutiveof1s {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,1,1};
        System.out.println(maxCons(arr));
    }
    static int maxCons(int[] arr){
        int maxLen=0;
        int cnt =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) cnt++;
            else cnt=0;
            maxLen = Math.max(maxLen,cnt);
        }return maxLen;
    }
}

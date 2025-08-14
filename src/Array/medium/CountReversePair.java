package Array.medium;

public class CountReversePair {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 1, 20};
        int ans = countRevPairs(arr);
        System.out.println(ans);


    }
    public static int countRevPairs(int[] arr){
        int cnt=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                 if (arr[i]>2*arr[j])
                 {
                     cnt++;
                 }
            }
        }
        return cnt;
    }

}

package DSAPattern.TwoPointer;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4};
        int ans =countDuplicate(arr);
        System.out.println(ans);
    }

    public static int countDuplicate(int[] arr){
        int n = arr.length;
        if (n == 0) return 0;

        int i = 0;
        int j = 1;
        int count = 1;

        while (j < n) {
            if (arr[j] != arr[i]) {
                count++;
                i = j;
            }
            j++;
        }
        return count;
    }
}

package GggeksForGeeks;

public class Day23 {
    public static void main(String[] args) {
        int arr[] = {4,3,1,3};
        int ans = inversionCount(arr);
        System.out.println(ans);
    }


    // O(n*n)
    static int inversionCount(int arr[]) {
        // if array is already sorted
        if(isSorted(arr)){
            return 0;
        }

        int invCnt =0;
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    invCnt++;
                }
            }
        }
        return invCnt;
    }

    static boolean isSorted(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}